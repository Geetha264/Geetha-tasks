package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task33 {
    public static void main(String[] args) {
        // Unsorted HashMap
        Map<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(3, "C");
        unsortedMap.put(1, "A");
        unsortedMap.put(4, "D");
        unsortedMap.put(2, "B");

        // Convert HashMap to TreeMap (automatically sorted by keys)
        TreeMap<Integer, String> sortedMap = new TreeMap<>(unsortedMap);

        // Print sorted map
        System.out.println("Sorted Map (by keys):");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
