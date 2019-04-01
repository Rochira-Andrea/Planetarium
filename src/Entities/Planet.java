package Entities;

import java.util.concurrent.*;

public class Planet implements HeavenlyBody {

    @Override
    public void entryPoint(String planet) {

        // create an executor that implements a pool of 2 threads
        ExecutorService ES = Executors.newFixedThreadPool(2);

        // create two distinct runnable objects
        HiberThread hiberTrd = new HiberThread("hiberTrd",planet);
        WikiThread wikiTrd = new WikiThread("wikiTrd",planet);

        // pass the Runnable objects to the executor and start running their tasks
        ES.execute(hiberTrd);
        ES.execute(wikiTrd);

        // Implement Future & anonimous Callable to check on completion of threads
        Future<String> future = ES.submit(new Callable<String>() {
            @Override
            public String call() {
                return "Feedback from Callable";
            }
        });

        // gracefully terminate the executor
        ES.shutdown();
    }
}
