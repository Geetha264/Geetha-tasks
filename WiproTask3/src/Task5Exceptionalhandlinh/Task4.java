package Task5Exceptionalhandlinh;

public class Task4 {
	 public static void main(String[] args) {
	 try {
	 int[] arr = new int[5];
	 arr[5] = 100 / 0;
	 } catch (ArithmeticException e) {
	 System.out.println("Divide by zero error.");
	 } catch (ArrayIndexOutOfBoundsException e) {
	 System.out.println("Array index error.");
	 }
	 }
}