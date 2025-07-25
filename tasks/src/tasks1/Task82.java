package tasks1;

public class Task82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;

        System.out.println("Original int value: " + x);
        System.out.println("Post increment: " + (x++));  // First print x, then increment
        System.out.println("Pre increment: " + (++x));   // First increment x, then print

        // Bitwise shift operators
        System.out.println("Bitwise left shift: " + (x << 1));   // Shift x left by 1 bit
        System.out.println("Bitwise right shift: " + (x >> 1));  // Shift x right by 1 bit

        // Logical vs Bitwise AND
        boolean a = true;
        boolean b = false;

        System.out.println("Logical AND (a && b): " + (a && b)); // false
        System.out.println("Bitwise AND (a & b): " + (a & b));   // false

        // Bitwise AND and OR with integers
        int m = 6;
        int n = 7;

        System.out.println("Bitwise AND (m & n): " + (m & n));   // 6
        System.out.println("Bitwise OR (m | n): " + (m | n));    // 7
    }


	}
