public class Task3Multithreding {

    static class NumberPrinter extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread1: " + i);
                try {
                    Thread.sleep(1000); // 1 second delay
                } catch (InterruptedException e) {
                    System.out.println("Thread1 was interrupted.");
                }
            }
        }
    }

    public static void main(String[] args) {
        NumberPrinter thread1 = new NumberPrinter();
        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }
        System.out.println("Main thread done");
    }
}
