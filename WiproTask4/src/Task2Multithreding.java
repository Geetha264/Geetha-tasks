
public class Task2Multithreding implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
    	Task2Multithreding counter = new Task2Multithreding();
        Thread thread = new Thread(counter);
        thread.start();
    }
}
