package day1examples;

public class NestedLoop {

	public static void main(String[] args) {
		// while loop 3
		// For loop 6
		// do while loop 2
		
		
		int d=0, count=0;
		
		while (d<3)
		{
			for (int f=0; f<6; f++)
			{
				
				int k=0;
						do{
							System.out.println("d="+d+"  f="+f+" k="+k);
						
							k++;
							count++;

						   }
						
						while(k<2);
			}
				d++;
				
		}		
			System.out.println("The total count is:"+count);				
											
			}
	
}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


