import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static void main(String[] args) {
//      Timer = Class that schedule tasks
//        uses: sending noti, schedule update, retitive ations

//        TimerTask= Represents the class that will be executed by the timer
//        extend timerTask class to define own task
//        Create a subclass of TimerTask and @Override run()

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3;

            @Override
            public void run() {
                count--;
                System.out.println("Sup!");
                if (count <= 0) {
                    System.out.println("Done!");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 500, 200);
    }
}


