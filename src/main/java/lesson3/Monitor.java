package lesson3;

public class Monitor {
    private static Monitor INSTANCE;
    private static int counter;

    //
    private Monitor() {
    }

    public synchronized static Monitor getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Monitor();
        }
        return INSTANCE;
    }

    public static void setCounter(int counter) {
        Monitor.counter = counter;
    }

    public static int getCounter() {
        return counter;
    }
}
