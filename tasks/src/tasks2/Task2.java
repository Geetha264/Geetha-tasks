package tasks2;

class Employee{
	static int count=0;
	String name;


	Employee(String name) {
		this.name=name;
		// TODO Auto-generated method stub
		count++;
		
	}
	
	void show() {
		System.out.println("Employee name "+name);
	}
	
	static void getCount() {
		System.out.println("Total Employee "+count);
	}
}
		

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Test");
		Employee e2=new Employee("Bob");
		Employee e3=new Employee("Geetha");
		e1.show();
		e2.show();
		e3.show();
		Employee.getCount();
		//System.out.println("Total Employee "+Employee.count);
	
		
		
		
		
		
		
	}
}

