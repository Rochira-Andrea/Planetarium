package Entities;

import Hibernate.Planeter;
import Hibernate.Sphere;
import Servlets.Controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;

public class HiberThread implements Runnable {

    Thread thrd;
    String planet;

    HiberThread(String threadName, String planetName){
        thrd = new Thread(this, threadName);
        this.planet = planetName;
    }

    @Override
    public void run() {

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
            Controller.hiberSphere = mapper.readValue(json, Sphere.class);

        } catch (IOException e) {
                e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }

    }
}
