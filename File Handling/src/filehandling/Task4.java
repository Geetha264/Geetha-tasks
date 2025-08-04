package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        // Define the source and destination file paths
        String sourceFile = "info.txt";
        String destinationFile = "copy.txt";

        try (FileReader reader = new FileReader(sourceFile); 
             FileWriter writer = new FileWriter(destinationFile)) {

            int character;
            // Read each character from the source file and write it to the destination file
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            // Handle any potential IO exceptions
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
