package tasks1;
import java.util.Scanner;

public class Task81 {
    public static void main(String[] args) {
        int a, b;
        char operator;
        int res = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        b = sc.nextInt();

        System.out.print("Enter the operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                if (b != 0) {
                    res = a / b;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }

        System.out.println("Result: " + res);
    }
}
