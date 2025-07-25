package tasks1;

public class Task93 {

			public static void main(String[] args) {

			int count = 0, num2 = 2;

			while (count < 10) { 
				boolean prime = true; 
				for (int i=2; i <= num2/2; i++) 
					if (num2 % i == 0) {
							prime = false;
							break;
					} 
					if (prime) {
						System.out.println(num2);
						count++; 
						}
			num2++;

			}
			}
}
