package filehandling;

import java.io.*;
import java.util.Scanner;

public class Task8 {

    private static final String FILE_NAME = "contacts.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Contact Manager ===");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    searchContact(scanner);
                    break;
                case 4:
                    System.out.println("Exiting Contact Manager.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }

    private static void addContact(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine().trim();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(name + "," + phone);
            writer.newLine();
            System.out.println("✅ Contact added.");
        } catch (IOException e) {
            System.err.println("❌ Error adding contact: " + e.getMessage());
        }
    }

    private static void displayContacts() {
        System.out.println("\n📇 All Contacts:");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 2);
                if (parts.length == 2) {
                    System.out.println("Name: " + parts[0] + " | Phone: " + parts[1]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No contacts found.");
            }
        } catch (IOException e) {
            System.err.println("Error reading contacts: " + e.getMessage());
        }
    }

    private static void searchContact(Scanner scanner) {
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine().toLowerCase();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 2);
                if (parts.length == 2 && parts[0].toLowerCase().contains(searchName)) {
                    System.out.println("Found: Name: " + parts[0] + " | Phone: " + parts[1]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No matching contact found.");
            }
        } catch (IOException e) {
            System.err.println("Error searching contacts: " + e.getMessage());
        }
    }
}
