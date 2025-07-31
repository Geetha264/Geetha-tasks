package wrapper;

import java.util.ArrayList;
import java.util.Arrays;
public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        // Step 1: Input list of temperature strings
        String[] tempStrings = {"36", "38", "40"};

        // Step 2: Convert to integers using Integer.parseInt()
        ArrayList<Integer> celsiusTemps = new ArrayList<>();
        for (String tempStr : tempStrings) {
            int temp = Integer.parseInt(tempStr); // wrapper method
            celsiusTemps.add(temp);
        }

        // Step 3: Convert Celsius to Fahrenheit and store in ArrayList<Double>
        ArrayList<Double> fahrenheitTemps = new ArrayList<>();
        for (int celsius : celsiusTemps) {
            double fahrenheit = (celsius * 9.0 / 5) + 32;
            fahrenheitTemps.add(fahrenheit);
        }

        // Step 4: Print both Celsius and Fahrenheit values
        System.out.println("Celsius to Fahrenheit Conversion:");
        for (int i = 0; i < celsiusTemps.size(); i++) {
            System.out.printf("Celsius: %d°C => Fahrenheit: %.2f°F%n",
                    celsiusTemps.get(i), fahrenheitTemps.get(i));
        }
    }
}
