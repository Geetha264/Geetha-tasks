package wrapper;

import java.util.*;

public class StudentScoreBoardApp {

    public static void main(String[] args) {
        // Step 1: Create Map to store student names and scores
        Map<String, List<Integer>> studentScores = new HashMap<>();

        // Add students and their marks using ArrayList<Integer>
        studentScores.put("Alice", Arrays.asList(85, 90, 92));
        studentScores.put("Bob", Arrays.asList(78, 82, 88));
        studentScores.put("Charlie", Arrays.asList(95, 91, 89));

        String topStudent = null;
        Double highestAverage = null;

        System.out.println("Student Averages:");

        for (Map.Entry<String, List<Integer>> entry : studentScores.entrySet()) {
            String name = entry.getKey();
            List<Integer> marks = entry.getValue();

            // Step 2: Calculate average score using unboxing
            int total = 0;
            for (Integer mark : marks) {
                total += mark; // unboxing Integer to int
            }
            double average = (double) total / marks.size();
            System.out.printf("%s: %.2f%n", name, average);

            // Step 3: Find highest scorer using wrapper comparison
            if (highestAverage == null || average > highestAverage) {
                highestAverage = average;
                topStudent = name;
            }
        }

        // Output highest scorer
        System.out.println("\nTop Scorer:");
        System.out.printf("%s with average %.2f%n", topStudent, highestAverage);
    }
}
