package wrapper;

import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Double> ar=new ArrayList<Double>();
		ar.add(10.1);
		ar.add(9.4);
		ar.add(90.4);
		
		
		//Retrieve values and calculate the sum using unboxing
		double sum = 0.0;
        for (Double value : ar) {
            sum += value; // unboxing happens automatically
        }
        
        // calculate Average
        double average= sum/ar.size();
        
        
        //Print sum and average
        System.out.println("Sum: "+sum);
        System.out.println("Average: " +average);
        
        
		
		
		
		

	}

}
