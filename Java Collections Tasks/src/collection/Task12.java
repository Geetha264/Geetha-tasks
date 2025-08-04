package collection;



import java.util.ArrayList;
import java.util.Collections;

public class Task12 {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(50);
        numbers.add(20);
        numbers.add(70);
        numbers.add(10);
        numbers.add(40);

        // Sort in ascending order
        Collections.sort(numbers);
        System.out.println("Ascending Order: " + numbers);

        // Sort in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + numbers);
    }
}
