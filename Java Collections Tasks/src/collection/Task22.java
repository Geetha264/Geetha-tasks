package collection;

import java.util.TreeSet;
import java.util.Set;

public class Task22 {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        Set<Integer> numbers = new TreeSet<>();

        // Add integers (unsorted)
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        // TreeSet stores elements in sorted (ascending) order automatically
        System.out.println("Sorted TreeSet: " + numbers);
    }
}
