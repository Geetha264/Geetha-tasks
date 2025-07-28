
public class Task1Multithreding extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Thread!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }

    public static void main(String[] args) {
    	Task1Multithreding thread = new Task1Multithreding();
        thread.start();
    }
}
