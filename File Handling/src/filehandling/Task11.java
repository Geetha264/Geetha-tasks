package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        String fileName = "contacts.txt"; 

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            // If file exists, read lines
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the file name.");
        }
    }
}
