package javaexceptions;

public class Finally_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int i[]= new int[3];
			i[4]=20;
			System.out.println("No error occured");
			
			
		}
		catch(Throwable t) {
			System.out.println("Error or exception occured");
		}
		
		finally {
			System.out.println("Closing the all active session in finally block");
		}

		
	}

}

// The finally will be used in exception handling.

