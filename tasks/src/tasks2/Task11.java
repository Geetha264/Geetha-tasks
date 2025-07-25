package tasks2;

interface Operation {
	 int operate(int a, int b);
	}
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation add = (a, b) -> a + b;
		Operation sub = (a, b) -> a - b;
		Operation mul = (a, b) -> a * b;
		
		System.out.println("Add: " + add.operate(10, 5));
		System.out.println("Sub: " + sub.operate(10, 5));
		System.out.println("Mul: " +mul.operate(2,3));

	}

}
