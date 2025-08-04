package collection;


import java.util.HashSet;
import java.util.Set;

public class Task21 {

    public static void main(String[] args) {
        // Create a HashSet of Strings
        Set<String> languages = new HashSet<>();

        // Add elements (with duplicates)
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");   // Duplicate
        languages.add("Python"); // Duplicate

        // Print the HashSet
        System.out.println("HashSet contents: " + languages);
    }
}
