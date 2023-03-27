package lesson3;

import java.text.MessageFormat;
import java.util.concurrent.locks.ReentrantLock;


public class Multithreading implements Runnable {
    private static final Monitor monitor = Monitor.getInstance();
    private static final int COUNTS = 5;
    private final String word;
    private final String exercise;
    private static final ReentrantLock locker = new ReentrantLock();

    public Multithreading(String word, String exercise) {
        this.word = word;
        this.exercise = exercise;
    }

    @Override
    public void run() {
        switch (exercise) {
            case "ex1":
                synchronized (monitor) {
                    threadWork(COUNTS, word);
                }
                break;
            case "ex2": {
                threadWork2(COUNTS);
                break;
            }
        }
    }

    private static void threadWork(int count, String word) {
        while (true) {
            System.out.println(MessageFormat.format("Thread \"{0}\" - {1}", Thread.currentThread().getName(), word));
            try {
                monitor.notify();
                if (--count == 0) {
                    Thread.currentThread().interrupt();
                    break;
                } else {
                    monitor.wait();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
    }

    private static void threadWork2(int counts) {
        try {
            Thread.sleep(1000);
            locker.lock();
            for (int i = 0; i < counts; ++i) {
                monitor.setCounter(i);
                System.out.printf("%s %d \n", Thread.currentThread().getName(), monitor.getCounter());
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            locker.unlock();
        }
    }
}
