package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        // Initialize the word count
        int wordCount = 0;

        try {
            // Open the file for reading
            BufferedReader reader = new BufferedReader(new FileReader("info.txt"));

            String line;
            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                // Split the line into words (using spaces or any whitespace as a delimiter)
                String[] words = line.split("\\s+");
                // Add the number of words in the current line to the total count
                wordCount += words.length;
            }

            // Close the reader
            reader.close();

            // Output the total word count
            System.out.println("Total words: " + wordCount);

        } catch (IOException e) {
            // Handle any potential IO exceptions
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
