package wrapper;

import java.util.Optional;

public class Task9 {

    public static void main(String[] args) {
        // Step 1: Declare a Double object and set it to null
        Double myDouble = null;

        // Step 2: Try unboxing (causes NullPointerException)
        try {
            double value = myDouble; // unboxing
            System.out.println("Unboxed value: " + value);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException during unboxing.");
        }

        // Step 3a: Use Optional to provide default value
        Optional<Double> optionalDouble = Optional.ofNullable(myDouble);
        double safeValue1 = optionalDouble.orElse(0.0);
        System.out.println("Value using Optional: " + safeValue1);

        // Step 3b: Use default value strategy without Optional
        double safeValue2 = (myDouble != null) ? myDouble : 0.0;
        System.out.println("Value using default strategy: " + safeValue2);
    }
}
