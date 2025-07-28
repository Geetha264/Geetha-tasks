import java.util.Random;

class AnimalRunner implements Runnable {
    private String name;
    private Random random = new Random();

    public AnimalRunner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " running... (" + i + ")");
            try {
                Thread.sleep(random.nextInt(500)); // Sleep for 0–499 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Task11Multithreding {
    public static void main(String[] args) {
        Thread tortoise = new Thread(new AnimalRunner("Tortoise"));
        Thread rabbit = new Thread(new AnimalRunner("Rabbit"));
        Thread dog = new Thread(new AnimalRunner("Dog"));

        tortoise.start();
        rabbit.start();
        dog.start();
    }
}
