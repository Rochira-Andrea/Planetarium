package Entities;

import Hibernate.Planeter;
import Hibernate.Sphere;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

public class Planet implements HeavenlyBody {

    @Override
    public ArrayList<Object> entryPoint(String planet) {

        ArrayList<Object> temp = new ArrayList<>();

        // HIBERNATE BLOCK - INCLUDES JSON
        // create the session manager
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Planeter.class).buildSessionFactory();

        // create a Session object to establish the connection with the database
        Session session = factory.getCurrentSession();

        try {
            // retrieve back the record related to the selected planet
            Planeter plan;
            session.beginTransaction();
            plan = session.get(Planeter.class,planet);

            // extract the json string from the "details" field
            String json = plan.getPlanetDetails();

            // deserialize the json string into a Sphere object
            ObjectMapper mapper = new ObjectMapper();
            Sphere sphere = mapper.readValue(json, Sphere.class);

            // add the Sphere object to the ArrayList
            temp.add(sphere);

            session.flush();
            session.clear();
            session.close();
            factory.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        // HTTPURLCONNECT BLOCK - IMPLEMENTS JSOUP
        String element = "#"+planet+" + p";
        String paragraph;

        // Retrieve the related content from the website www.space.com
        try {
            String strUrl = "https://www.space.com/16080-solar-system-planets.html";
            InputStream inStream = new URL(strUrl).openStream();
            Document url = Jsoup.parse(inStream,"UTF-8",strUrl);
            // paragraph = Parser.unescapeEntities(doc.body().select(element).text(),true);
            // Document url = Jsoup.connect(strUrl).userAgent("Mozilla/66.0").get();

            paragraph = url.body().select(element).text();

            // add the String object to the ArrayList
            temp.add(paragraph);

        } catch (IOException e){
            System.out.println("Unable to retrieve the required content");
        }

        // return the ArrayList to the Controller
        return temp;
    }
}
