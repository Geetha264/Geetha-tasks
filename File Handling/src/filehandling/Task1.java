package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        // Create a File object representing "info.txt"
        File file = new File("info.txt");

        try {
            // Create the file if it doesn't already exist
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // Now write to the file
            FileWriter writer = new FileWriter(file);

            // Write the first line to the file
            writer.write("Java I/O is powerful!\n");

            // Append the second line
            writer.write("Learn Java step-by-step");

            // Close the writer
            writer.close();

            System.out.println("File written successfully!");

        } catch (IOException e) {
            // Handle any potential IO exceptions
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
