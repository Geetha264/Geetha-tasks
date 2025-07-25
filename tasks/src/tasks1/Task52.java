package tasks1;

public class Task52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String GivenString = String.join(" ", args);/* join with single string even when we enter string
		                                                with separate string*/
        String reversedString = ""; //storing the reverse string

 
        for (int i = GivenString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + GivenString.charAt(i); /*charAt() exactly the character will give
                                                                      at that position*/
        }

        System.out.println("Original string: " + GivenString);
        System.out.println("Reversed string: " + reversedString);

	}

}
