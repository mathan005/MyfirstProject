package day1examples;

public class ExampleAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y;
		x=10;
		y=-2;
		
		if(x<0 && y<0){
			
			System.out.println("both numbers are negative");
			
		}
		
		else if(x>0 || y>0){
			System.out.println("anyone number is poitive");			
		}

		else{
			System.out.println("both numbers are non positive and negative");
		}
		
		
			//  JDK = JAVA Compiler + JRE(JVM + Lib files)
		

	}

}
