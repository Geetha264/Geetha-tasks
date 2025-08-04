package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task42 {
    public static void main(String[] args) {
        // Create an ArrayList with elements
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Create a ListIterator
        ListIterator<String> iterator = names.listIterator();

        // Traverse forward
        System.out.println("Forward traversal:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Traverse backward
        System.out.println("Backward traversal:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
