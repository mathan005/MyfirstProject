import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		/*
		 * int n=10; if (n%2==0) { System.out.println("n is even");
		 * 
		 * }
		 * 
		 * else System.out.println("n is odd");
		 */
		
		int n;
		
		System.out.println("Enter the integer number");
		
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		
		if (n%2==0) {
			System.out.println("n is even");
			
		}
		
		

	}

}
