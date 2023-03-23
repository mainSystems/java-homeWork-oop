package lesson3;

import java.util.ArrayList;
import java.util.List;

public class lesson3 {
    private static final int threadCount = 3;

    public static void main(String[] args) {

        Multithreading ping = new Multithreading("ping","ex1");
        Multithreading pong = new Multithreading("pong","ex1");
        Multithreading counter = new Multithreading("pong","ex2");

        Thread t1 = new Thread(ping);
        Thread t2 = new Thread(pong);
        Thread t3 = new Thread(counter);

        threading(t1, t2, t3);

    }

    private static void threading(Thread thread0, Thread thread1, Thread thread2) {
        List<Thread> threads = new ArrayList<>();
        threads.add(thread0);
        threads.add(thread1);
        threads.add(thread2);

        for (int i = 0; i < threadCount; i++) {
            try {
                threads.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            threads.get(i).start();
        }
    }

}
