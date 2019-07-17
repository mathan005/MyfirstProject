package javaexceptions;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("beginning case");
		
		try {
		int divide =10/2;
		System.out.println(divide);
		}catch(Exception e) {
	    System.out.println("error occured");
	    
	    }
		System.out.println("ending case");
	    System.out.println("Array beginning case");
		try {
			
	    int i[]=new int[4];
	    i[2]=10;

		} catch(Exception e) {
			
			System.out.println("After the try catch array");
		}
		
	}
	
	
	
	

}


