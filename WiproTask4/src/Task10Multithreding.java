class Chat {
    private boolean senderTurn = true;

    public synchronized void send(String message) {
        while (!senderTurn) {
            try {
                wait(); // Wait until it's sender's turn
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sender: " + message);
        senderTurn = false;
        notify(); // Notify receiver
    }

    public synchronized void receive(String message) {
        while (senderTurn) {
            try {
                wait(); // Wait until it's receiver's turn
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Receiver: " + message);
        senderTurn = true;
        notify(); // Notify sender
    }
}

class Sender implements Runnable {
    private Chat chat;
    private String[] messages = { "Hi!", "How are you?", "I’m doing great.", "What about you?", "Bye!" };

    public Sender(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void run() {
        for (String msg : messages) {
            chat.send(msg);
            try {
                Thread.sleep(200); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Receiver implements Runnable {
    private Chat chat;
    private String[] replies = { "Hello!", "I’m fine.", "Good to hear that.", "I’m also good.", "See you!" };

    public Receiver(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void run() {
        for (String reply : replies) {
            chat.receive(reply);
            try {
                Thread.sleep(200); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Task10Multithreding {
    public static void main(String[] args) {
        Chat chat = new Chat();

        Thread senderThread = new Thread(new Sender(chat));
        Thread receiverThread = new Thread(new Receiver(chat));

        senderThread.start();
        receiverThread.start();
    }
}
