package tasks1;
import java.util.Scanner;

public class Task92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        Scanner scanner = new Scanner(System.in);
		        int choice;
		        double n1, n2, result;

		        do {
		            System.out.println("\n--- Calculator Menu ---");
		            System.out.println("1. Addition");
		            System.out.println("2. Subtraction");
		            System.out.println("3. Multiplication");
		            System.out.println("4. Division");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");

		            choice = scanner.nextInt();

		            // Perform operation based on choice
		            switch (choice) {
		                case 1:
		                    System.out.print("Enter first number: ");
		                    n1 = scanner.nextDouble();
		                    System.out.print("Enter second number: ");
		                    n2 = scanner.nextDouble();
		                    result = n1 + n2;
		                    System.out.println("Result: " + result);
		                    break;
		                case 2:
		                    System.out.print("Enter first number: ");
		                    n1 = scanner.nextDouble();
		                    System.out.print("Enter second number: ");
		                    n2 = scanner.nextDouble();
		                    result = n1 - n2;
		                    System.out.println("Result: " + result);
		                    break;
		                case 3:
		                    System.out.print("Enter first number: ");
		                    n1 = scanner.nextDouble();
		                    System.out.print("Enter second number: ");
		                    n2 = scanner.nextDouble();
		                    result = n1 * n2;
		                    System.out.println("Result: " + result);
		                    break;
		                case 4:
		                    System.out.print("Enter first number: ");
		                    n1 = scanner.nextDouble();
		                    System.out.print("Enter second number: ");
		                    n2 = scanner.nextDouble();
		                    if (n2 != 0) {
		                        result = n1 / n2;
		                        System.out.println("Result: " + result);
		                    } else {
		                        System.out.println("Error: Division by zero is not allowed.");
		                    }
		                    break;
		                case 5:
		                    System.out.println("Exiting Calculator. Goodbye!");
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
		            }
		        } while (choice != 5); 

		        scanner.close(); 
		    }
		

	

}
