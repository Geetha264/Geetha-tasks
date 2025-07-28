class Counter {
    int count = 0; 
}

class CounterThread extends Thread {
    Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.count++;
            try {
                Thread.sleep(0, 1); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Task6Multithreding {
    public static void main(String[] args) throws InterruptedException {
        Counter sharedCounter = new Counter();
        CounterThread t1 = new CounterThread(sharedCounter);
        CounterThread t2 = new CounterThread(sharedCounter);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Counter Value: " + sharedCounter.count);
    }
}
