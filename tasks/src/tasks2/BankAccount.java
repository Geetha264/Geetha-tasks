package tasks2;

public class BankAccount {
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accNum,double initialBalance) {
		accountNumber=accNum;
		balance=initialBalance;
	}

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	}
	
	
