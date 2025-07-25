package tasks2;


class Calculator{
	void add(int x, int y) {
		int res=x+y;
		System.out.println(res);
	}
	
	void add(double x, double y) {
		double res=x+y;
		System.out.println(res);
	}
	
	void add(String x, String y) {
		String res=x+y;
		System.out.println(res);
	}
	
}
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c=new Calculator();
		c.add(10, 20);
		c.add(3.5, 2.1);
		c.add("Geetha ", "Vani");

	}

}
