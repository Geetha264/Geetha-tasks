class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized withdraw method to prevent race condition
    public synchronized void withdraw(int amount, String user) {
        if (balance >= amount) {
            System.out.println(user + " is trying to withdraw ₹" + amount);
            try {
                Thread.sleep(100); // Simulate time taken for processing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(user + " successfully withdrew ₹" + amount + ". Remaining balance: ₹" + balance);
        } else {
            System.out.println(user + " tried to withdraw ₹" + amount + " but insufficient balance. Remaining: ₹" + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}

class WithdrawTask implements Runnable {
    private BankAccount account;
    private String user;
    private int amount;

    public WithdrawTask(BankAccount account, String user, int amount) {
        this.account = account;
        this.user = user;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount, user);
    }
}

public class Task8Multithreding {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(1000);

        Thread t1 = new Thread(new WithdrawTask(sharedAccount, "User1", 700));
        Thread t2 = new Thread(new WithdrawTask(sharedAccount, "User2", 700));

        t1.start();
        t2.start();
    }
}
