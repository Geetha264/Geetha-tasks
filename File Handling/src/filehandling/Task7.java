package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task7 {
    public static void main(String[] args) {
        // 1. Create a timestamp in the format [yyyy-MM-dd HH:mm:ss]
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = LocalDateTime.now().format(formatter);

        // 2. Combine with log message
        String logEntry = "[" + timestamp + "] Application started";

        // 3. Write to app.log (append mode)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("app.log", true))) {
            writer.write(logEntry);
            writer.newLine(); // Move to next line after log
            System.out.println("Log written: " + logEntry);
        } catch (IOException e) {
            System.err.println("Failed to write log: " + e.getMessage());
        }
    }
}
