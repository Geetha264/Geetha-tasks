package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Task41 {
    public static void main(String[] args) {
        // Create an ArrayList with some names
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Charlie");
        names.add("Anna");

        // Use an Iterator to traverse and remove elements starting with 'A'
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("A")) {
                iterator.remove(); // Safe removal using iterator
            }
        }

        // Print the modified list
        System.out.println("List after removing names starting with 'A': " + names);
    }
}
