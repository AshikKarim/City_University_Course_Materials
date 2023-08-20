package Practice;

class Counter {
    private int count = 0;

    synchronized void increment() {
        count++;
        System.out.println("Count: " + count);
    }
}

class Worker extends Thread {
    Counter counter;

    Worker(Counter c) {
        counter = c;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Worker w1 = new Worker(counter);
        Worker w2 = new Worker(counter);

        w1.start();
        w2.start();
    }
}
