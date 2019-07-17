package packagelaunch;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Launch {

	public static void main(String[] args) {

		int a=2;
		int b=3;

		System.out.println("Before swapping the value of a = "+ a +" and b ="+b );

		a = b-a;
		b = b-a;
		a = a+b; 
		System.out.println("After swapping the value of a = "+ a +" and b ="+b );
		
		
	}

}


