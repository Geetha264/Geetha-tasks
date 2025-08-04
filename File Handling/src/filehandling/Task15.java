package filehandling;

import java.io.File;

public class Task15 {
    public static void main(String[] args) {
        // Specify the directory path here
        String dirPath = "C:\\Users\\Admin\\Downloads\\java-workspace\\File Handling";

        File directory = new File(dirPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }

        System.out.println("Listing contents of directory: " + dirPath);
        scanDirectory(directory);
    }

    private static void scanDirectory(File dir) {
        File[] contents = dir.listFiles();

        if (contents == null) {
            System.out.println("Unable to access directory contents.");
            return;
        }

        for (File file : contents) {
            String type = file.isDirectory() ? "Directory" : "File";
            long size = file.length(); // size in bytes

            System.out.printf("%-20s %-10s %d bytes%n", file.getName(), type, size);
        }
    }
}
