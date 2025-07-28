class Counte {
    int count = 0; // Shared counter (not synchronized)
}

class CounterThreads extends Thread {
    Counte counter;

    CounterThreads(Counte counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.count++; // Not thread-safe (no synchronization)
        }
    }
}

public class 	Task7Multithreding {
    public static void main(String[] args) throws InterruptedException {
        Counte sharedCounter = new Counte();

        // Create 2 threads sharing the same Counter object
        CounterThreads t1 = new CounterThreads(sharedCounter);
        CounterThreads t2 = new CounterThreads(sharedCounter);

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print the final counter value
        System.out.println("Final Counter Value: " + sharedCounter.count);
    }
}
