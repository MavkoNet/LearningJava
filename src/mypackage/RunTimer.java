package mypackage;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class RunTimer {

    //ждет ввода с клавиатуры
    public static void main(String[] args) throws InterruptedException {
        long time = new Scanner(System.in).nextLong();
        for (int i = (int) time; i >= 0; i--) {
            System.out.println("Осталось: " + ((i > 4)? i + " секунд": (i > 1)? i + " секунды" : (i == 1)? i + " секунда" : "менее секунды"));
            Thread.sleep(1000L);
        }
        System.out.println("Время истекло!");
    }

    //То же самое, только другим способом (переименовать main2 -> main и запустить)
    public static void main2(String[] args) {
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Knock-Knock!");
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, 3000);

        for ( int i = 0; i < 5; ++i ) {
            System.out.println("Do something...");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ie) {}
        }

        System.exit(0);
    }
}