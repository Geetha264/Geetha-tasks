package filehandling;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        // Create a Scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter some text: ");
        String input = scanner.nextLine();

        // Reverse the input using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        // Print the reversed text
        System.out.println("Reversed text: " + reversed);

        // Close the scanner
        scanner.close();
    }
}
