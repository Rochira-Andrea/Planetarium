package Entities;

public class HiberThread implements Runnable {

    Thread thrd;
    String planet;

    HiberThread(String threadName, String planetName){
        thrd = new Thread(this, threadName);
        this.planet = planetName;
    }

    @Override
    public void run() {

    }
}
