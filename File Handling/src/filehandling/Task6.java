package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        // Define the file path where we will save the data
        String filePath = "userdata.txt";

        try (FileWriter writer = new FileWriter(filePath)) {
            // Write the user's details to the file, each on a new line
            writer.write("Name: " + name + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Address: " + address + "\n");

            System.out.println("User data saved successfully to " + filePath);

        } catch (IOException e) {
            // Handle any potential IO exceptions
            System.out.println("An error occurred while saving the data: " + e.getMessage());
        } finally {
            // Close the scanner object
            scanner.close();
        }
    }
}
