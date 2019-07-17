package day2examples;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Break should be used in outside of a loop or switch
		// continue should be used in outside of a loop--> this can be used to avoid printing the particular satisfied conditions.
		
		
		for (int x=0; x<6; x++)	
		{
			if (x>4)
			break;
		
		System.out.println("break="+x);
		
		
		
		}
		for (int x=0; x<6; x++)	
		{
		
		if (x>2 && x<5) 
	        continue;
		System.out.println("Continue="+x);
	}
	}

}
