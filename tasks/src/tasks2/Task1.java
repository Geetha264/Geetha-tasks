package tasks2;


	
	class book{
		String title;
		String author;
		int price;
		
		void displayDetails(String title,String author,int price) {
			System.out.println("Title: "+title + " "+ "Author: " +author +" " +"Price: " +" "+price);	
		}
	}
		public class Task1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book a=new book();
		a.displayDetails("The Girl with a Desire", "Feroz Tabassum", 200);
		
		book b=new book();
		b.displayDetails("Use Water as your MEDICINE", "A.O.ABUDU", 200);

		

	}
		}
	

