package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Learner {
    String name;
    int marks;

    public Learner(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class Task52 {
    public static void main(String[] args) {
        List<Learner> learners = new ArrayList<>();

        learners.add(new Learner("Alice", 85));
        learners.add(new Learner("Bob", 92));
        learners.add(new Learner("Charlie", 78));
        learners.add(new Learner("David", 90));

        // Sort learners by name alphabetically using Comparator
        Collections.sort(learners, new Comparator<Learner>() {
            @Override
            public int compare(Learner l1, Learner l2) {
                return l1.name.compareTo(l2.name);
            }
        });

        // Print sorted learners
        System.out.println("Learners sorted by name:");
        for (Learner l : learners) {
            System.out.println(l);
        }
    }
}
