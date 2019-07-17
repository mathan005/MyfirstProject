package day2examples;

public class LoopBreakContinue {
	
	public void go () {

		System.out.println("First Loop");

	System.out.println("Second Loop");
	}

	public static void main(String[] args) {

		LoopBreakContinue g = new LoopBreakContinue();
		
		g.go();		
		
		for (int i=10; i<20; i++)
		{
			if (i>=12 && i<15)
			continue;
			System.out.println(i);
		
			// Continue is used for the next iteration / cycle. If i want to remove some particular values, we can use continue.
			
		}
	}
		
	}

