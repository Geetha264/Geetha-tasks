package wrapper;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="101";
		String s1="12.1";
		String s2="true";
		
		//Convert to primitives
		int intValue = Integer.parseInt(s);
		double doubleValue = Double.parseDouble(s1);
		boolean booleanValue = Boolean.parseBoolean(s2);
		
		// Step 3: Print values and their types
        System.out.println("Converted int: " + intValue + " (Type: " + ((Object)intValue).getClass().getSimpleName() + ")");
        System.out.println("Converted double: " + doubleValue + " (Type: " + ((Object)doubleValue).getClass().getSimpleName() + ")");
        System.out.println("Converted boolean: " + booleanValue + " (Type: " + ((Object)booleanValue).getClass().getSimpleName() + ")");
    }
		

	}

