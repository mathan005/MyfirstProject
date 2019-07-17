package day2examples;

public class MethodVariarables {
	
	int a6=100;
	static int a7=10;
	
	
	
	
	// Local variable => It can be used within the objects only
	// Instance/Global variable => It can be used in within the class
	// Class variable =>

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodVariarables fat=new MethodVariarables();
		fat.local(45, 46);
	
		MethodVariarables fat2=new MethodVariarables();
		fat2.Local2();
		
		
				
	}
public void local(int a8, int a9)
{
	int sum=a8+a9;
	System.out.println("the sum of the number is "+sum);
	
	
}
public void Local2(){
	
     a6=10;
	int a5=20;
	System.out.println("the multiplication is "+a5*a6);
}
}
