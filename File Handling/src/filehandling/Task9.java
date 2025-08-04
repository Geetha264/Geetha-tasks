package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task9 {
    public static void main(String[] args) {
        String fileName = "info.txt";
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;

                // Split line into words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Count characters excluding spaces
                for (String word : words) {
                    charCount += word.length();
                }
            }

            // Display results
            System.out.println("File: " + fileName);
            System.out.println("Total Lines      : " + lineCount);
            System.out.println("Total Words      : " + wordCount);
            System.out.println("Total Characters : " + charCount + " (excluding spaces)");

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
