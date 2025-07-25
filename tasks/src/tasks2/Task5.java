package tasks2;

class Vehical{
	String brand ;
	int speed;	
	void showDetails() {
	System.out.println("Brand "+ brand +"speed " +speed +"Kmp" );
}
}

class Car extends Vehical{
	void showDetails() {
		System.out.println("Car Brand: " + brand + ",Car Speed:" +speed + "Kmp");
		
	}
}

class Bike extends Vehical{
	void showDetails() {
		System.out.println("Bike Brand: " + brand + ",Bike Speed:" +speed + "Kmp");
	
}
}

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.brand="Hyundai";
		c.speed=100;
		c.showDetails();
		
		Bike b=new Bike();
		b.brand="TVS";
		b.speed=80;
		b.showDetails();
		
			
		}
				
}


