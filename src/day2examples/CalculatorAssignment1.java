package day2examples;
// This is the example for creating the calculator with 4 different methods 
//and it should return the integer type

public class CalculatorAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculatorAssignment1 Ad = new CalculatorAssignment1();
		CalculatorAssignment1 sb = new CalculatorAssignment1();
		CalculatorAssignment1 Mu = new CalculatorAssignment1();
		CalculatorAssignment1 Dv = new CalculatorAssignment1();
		int u=Ad.add(10, 1);
		int o=sb.sub(10, 2);
		int p=Mu.mul(12, 12);
		int r=Dv.div(5, 1);
		
		System.out.println("The sum is="+u);
		
		System.out.println("The sub is="+o);
		
		System.out.println("The Mul is="+p);

		System.out.println("The div is="+r);


		
		
	}
	
	public int add(int a1, int a2)
	{
	
	return a1+a2;
			
	}
	
public int sub(int b1,int b2)
{
	


return b1-b2;

}
public int mul(int b1,int b2)
{
	

return b1*b2;
}

public int div(int b1,int b2)
{
	

return b1/b2;

}
}
