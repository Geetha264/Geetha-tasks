package tasks1;

public class Task41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		if(a>b) { 
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		
		for(int i=0;i<=5;i++) { 
			System.out.println("The value: " +i);
		}
		
		int count =0; 
		while(count<5) { 
			System.out.println("The count " +count);
			count++; 
			
		}
		String msg="Learning Java";
		switch(msg) {
		case "Learning Java":
			System.out.println("Keep learning");
			break;
			default:
				break;
		}

	}

}
