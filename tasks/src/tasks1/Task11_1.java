package tasks1;

public class Task11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gr="Hello World";
		System.out.println(gr.charAt(0));
		
		System.out.println(gr.toLowerCase());//convert lower case
		System.out.println(gr.toUpperCase());//convert upper case
		System.out.println(gr.lastIndexOf("H"));//index 
		System.out.println(gr.substring(6)); //substring of string starting from 6th index
		System.out.println("Length of string :" +gr.length());//length of string
		
		boolean test=gr.equals("Hello World");
		System.out.println(test);
		
		boolean test1=gr.equalsIgnoreCase("hello world");
		System.out.println(test1);
		
		boolean ar=gr.contains("Hello");
		System.out.println(ar);
		
		String gr1="uytd";
		System.out.println(gr+ " " +gr1);
		
		String gr3="";
		System.out.println(gr.isEmpty());
		System.out.println(gr3.isEmpty());
		
		String a="Apple";
		String b="Banana";
		String c="Apples";
		String d="Apple";
		
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo(d));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo(b));
		
		System.out.println(gr.endsWith("d"));

		
		
		

	}

}
