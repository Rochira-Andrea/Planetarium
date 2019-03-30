package Entities;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class WikiThread implements Runnable {

    public static String p;

    Thread thrd;
    String planet;

    WikiThread(String threadName, String planetName){
        thrd = new Thread(this, threadName);
        this.planet = planetName;
    }

    @Override
    public void run() {

        String element = "#"+planet+" + p";

        // Retrieve the related content from the website www.space.com
        try {
            Document url = Jsoup.connect("https://www.space.com/16080-solar-system-planets.html").userAgent("Mozilla/66.0").get();
            p = url.body().select(element).text();
            System.out.println(p);
        } catch (IOException e){
            System.out.println("Unable to retrieve the required content");
        }
    }
}
