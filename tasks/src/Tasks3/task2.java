package Tasks3;

abstract class Test {

    abstract double area();

    void displayShapeType() {
        System.out.println("This is a shape.");
    }
}

class Cr extends Test {
    private double radius;

    public Cr(double radius) {
        this.radius = radius;
    }


    double area() {
        return Math.PI * radius * radius;
    }
    
    void displayShapeType() {
        System.out.println("This is a Circle.");
    }
}

class Rr extends Test {
    private double length;
    private double width;

 
    public Rr(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
    void displayShapeType() {
        System.out.println("This is a Rectangle.");
    }
}


public class task2 {
    public static void main(String[] args) {
        Test Cr = new Cr(5);
        Test Rr = new Rr(4, 6);

      
        Cr.displayShapeType();
        System.out.println("Area: " + Cr.area());

        Rr.displayShapeType();
        System.out.println("Area: " + Rr.area());
    }
}
