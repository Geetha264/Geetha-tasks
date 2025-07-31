package wrapper;

import java.util.ArrayList;
import java.util.Collections;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(60);
		
		//By using collection to get min and max 
		Integer ar1=Collections.min(ar);
		Integer ar2=Collections.max(ar);
		
		//Average calculator
		int sum = 0;
		for (Integer integer : ar) {
			
            sum +=  integer; // unboxing happens here
        }
        double average = (double) sum / ar.size();
		
        //Print max min and average values
		System.out.println("Min value: "+ar1);
		System.out.println("Max value: "+ar2);
		System.out.println("Average value: "+average);
		
		
		
		

	}

}
