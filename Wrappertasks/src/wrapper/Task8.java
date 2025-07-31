package wrapper;

public class Task8 {
    private String accountNumber;
    private Double balance; // Wrapper type to demonstrate null handling

    // Constructor
    public Task8(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;

        // Handle null balance
        if (balance == null) {
            System.out.println("Balance is null, setting to default 0.0");
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Show balance
    public void showBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Case 1: Initialize with null balance
        Task8 acc1 = new Task8("123ABC", null);
        acc1.showBalance();
        acc1.deposit(200.0);
        acc1.withdraw(50.0);
        acc1.showBalance();

        System.out.println();

        // Case 2: Initialize with non-null balance
        Task8 acc2 = new Task8("456DEF", 500.0);
        acc2.showBalance();
        acc2.withdraw(600.0); // test insufficient funds
        acc2.deposit(100.0);
        acc2.showBalance();
    }
}
