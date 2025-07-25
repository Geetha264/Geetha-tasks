package tasks2;

public class Bankaccount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        BankAccount acc = new BankAccount("123456", 1000);
	        acc.deposit(500);
	        acc.withdraw(200);
	        System.out.println("Balance: " + acc.getBalance());
	    }

	}

