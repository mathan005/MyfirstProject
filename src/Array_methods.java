
public class Array_methods {

public static void Print(){
	
	System.out.println("Printing the line");
}
public static int a=25;
public static int b=20;

public static void addNumbers(){
	
	int c=a+b; 
	System.out.println("Adding two numbers=" +c);

}

//public static void addNumbers(int t, int g){
//	int h=t+g;
//	System.out.println("adding numbers with passing values="+h);
//	
	
//}

public static int addNumbers(int x,int z){
	
	int add=x+z;
return add;
	
}

public static String numbers(){
	System.out.println("value is");
	
	return "color";
}



public static void forloopmethod(int k){
	
	for (int c=1;c<10; c++){
		
		System.out.println(k*c);
		
	}
}

public static void main(String[] args) {
		/*
		 * Print(); addNumbers(); // addNumbers(20,60); int result=addNumbers(22,18);
		 * System.out.println("The adding values are="+result); forloopmethod(3);
		 * 
		 * // Array_methods value=new Array_methods(); String blue = numbers();
		 * System.out.println(blue);
		 */
	
	int sum = 0;
	for (int i=1;i>=100;i++)
	{
		int add = sum+i;
		System.out.println(add);
	}
	
}

}
