class CountdownTimer extends Thread {

    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Countdown: " + i);
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted");
            }
        }
        System.out.println("Time's up!");
    }
}

public class Task12Multithreding {
    public static void main(String[] args) {
        CountdownTimer timer = new CountdownTimer();
        timer.start(); // start the countdown
    }
}
