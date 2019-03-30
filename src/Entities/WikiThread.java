package Entities;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WikiThread implements Runnable {

    Thread thrd;
    String planet;

    WikiThread(String threadName, String planetName){
        thrd = new Thread(this, threadName);
        this.planet = planetName;
    }


    @Override
    public void run() {


        Document url = Jsoup.parse("https://www.space.com/16080-solar-system-planets.html");
        Element paragraph = url.selectFirst("h2:contains("+planet+")~p");

        // find out how to convert the element above in a string



    }
}
