class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running...");
        try {
            Thread.sleep(2000); // Simulate some work
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}


	public class Task4Multithreding {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();

        System.out.println("Before start: " + t.isAlive()); 
        t.start();
        System.out.println("After start: " + t.isAlive());
        t.join();
        System.out.println("After join: " + t.isAlive()); // false
    }
}
