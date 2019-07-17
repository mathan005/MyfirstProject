package abstractpackage;

public class Superclass1 {
	
	public void performUnlock() {
		System.out.println("Vehicle unlocked");
		
	}

	public void doRide(int a) {
		System.out.println("The available values from super class ");
		
		
	}
	
	public static void main(String[] args) {
		
		SubClass1 sbc = new SubClass1();
	
		sbc.doRide("section");
		sbc.performUnlock();
		
		
		
		
		
	}
}
