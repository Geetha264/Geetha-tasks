package wrapper;

import java.util.Arrays;
import java.util.Collections;

public class Task10 {

    public static void main(String[] args) {
        // Step 1: Create an array of Integer wrapper objects
        Integer[] numbers = {45, 12, 78, 34, 89, 23};

        // Step 2: Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // Print sorted array
        System.out.println("Sorted (descending): " + Arrays.toString(numbers));

        // Step 3: Find the 2nd highest value
        if (numbers.length >= 2) {
            Integer secondHighest = numbers[1]; // 2nd element in descending array
            System.out.println("Second highest value: " + secondHighest);
        } else {
            System.out.println("Not enough elements to determine the second highest.");
        }
    }
}
