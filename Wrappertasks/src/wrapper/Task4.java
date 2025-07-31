package wrapper;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Create two Integer objects with same value using:
			Autoboxing
			new Integer(100)
			Compare using == and .equals() and explain the difference*/
		
		        // Creating Integer objects
		        Integer a = 100;               // Autoboxing
		        Integer b = new Integer(100);  // Explicit object creation

		        // Comparisons
		        System.out.println("a == b: " + (a == b));         // Reference comparison
		        System.out.println("a.equals(b): " + a.equals(b)); // Value comparison
		    }
		}

	




