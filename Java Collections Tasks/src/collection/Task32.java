package collection;

import java.util.HashMap;
import java.util.Map;

public class Task32 {
    public static void main(String[] args) {
        String input = "hello";

        // Create a HashMap to store character frequencies
        Map<Character, Integer> freqMap = new HashMap<>();

        // Loop through each character in the string
        for (char c : input.toCharArray()) {
            if (freqMap.containsKey(c)) {
                // If character already exists, increment its count
                freqMap.put(c, freqMap.get(c) + 1);
            } else {
                // If character is not in map, add it with count 1
                freqMap.put(c, 1);
            }
        }

        // Print the frequency map
        System.out.println("Character frequencies: " + freqMap);
    }
}
