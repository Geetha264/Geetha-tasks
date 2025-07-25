package tasks2;
abstract class Shape {
abstract double area();
}

class Circle extends Shape {
double radius;
Circle(double radius) {
this.radius = radius;
}
double area() {
 return Math.PI * radius * radius;
}
}
class Rectangle extends Shape {
double length, width;
Rectangle(double length, double width) {
this.length = length;
this.width = width;
}
double area() {
 return length * width;
 }
}
public class Task4 {

	   public static void main(String[] args) {
	     Shape s1 = new Circle(5);         
	    Shape s2 = new Rectangle(4, 6);   

	    System.out.println("Circle Area: " + s1.area());
	    System.out.println("Rectangle Area: " + s2.area());
	    }
}


