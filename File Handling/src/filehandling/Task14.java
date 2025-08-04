package filehandling;

import java.io.*;
import java.nio.file.*;

public class Task14 {
    public static void main(String[] args) {
        // Input file paths
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String mergedFile = "merged.txt";

        try (
            BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile));
        ) {
            // Read and write contents of file1.txt
            Files.lines(Paths.get(file1)).forEach(line -> {
                try {
                    writer.write(line);
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Read and write contents of file2.txt
            Files.lines(Paths.get(file2)).forEach(line -> {
                try {
                    writer.write(line);
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            System.out.println("Files merged into merged.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
