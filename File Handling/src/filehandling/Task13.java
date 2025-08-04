package filehandling;

import java.io.*;
import java.nio.file.*;

public class Task13 {
    public static void main(String[] args) {
        // File paths
        String inputFile = "contacts.txt";
        String outputFile = "output.txt";

        try {
            // Read the content of the input file as a single string
            String content = new String(Files.readAllBytes(Paths.get(inputFile)));

            // Replace all occurrences of "Java" with "Python"
            String updatedContent = content.replaceAll("Java", "Python");

            // Write the updated content to the output file
            Files.write(Paths.get(outputFile), updatedContent.getBytes());

            System.out.println("Replacement complete. Check output.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
