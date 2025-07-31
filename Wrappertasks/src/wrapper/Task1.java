package wrapper;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitive data type
		
		int i=20;
		char c= 'A';
		double b=12.5;
		
		//Converting Primitive to wrapper class using valueof()
		Integer intWrapper = Integer.valueOf(i);
		Character charWrapper=Character.valueOf(c);
		Double doubleWrapper=Double.valueOf(b);
		
		
       // converting back to primitive type 
		
		int intPrim=intWrapper.intValue();
		char charPrim=charWrapper.charValue();
	    double doublePrim=doubleWrapper.doubleValue();
	    
	    System.out.println("The original value: " +i);
	    System.out.println("The Wrapper class value: " +intWrapper);
	    System.out.println("The Primitive value: " +intPrim);
	    
	    
	    System.out.println("The int value: " +c);
	    System.out.println("The Wrapper class value: " +charWrapper);
	    System.out.println("The Primitive value: " +charPrim);
	    
	    System.out.println("The int value: " +b);
	    System.out.println("The Wrapper class value: " +doubleWrapper);
	    System.out.println("The Primitive value: " +doublePrim);
	    
	}

}
