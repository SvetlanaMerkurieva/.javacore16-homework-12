package src.task1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Timer {
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public void timeInSec() {
        final Runnable timer = new Runnable() {
            int t = 0;

            @Override
            public void run() {
                t++;
                System.out.println("Тривалість: " + t + " сек");
                if (t % 5 == 0) {
                    System.out.println("Минуло 5 сек");
                }
            }
        };

        scheduler.scheduleAtFixedRate(timer, 1,1, SECONDS);
    }
}
