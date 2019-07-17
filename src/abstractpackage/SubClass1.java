package abstractpackage;

public class SubClass1 extends Superclass1  {
	
	
	public void doRide(String a) {
		System.out.println("This is from Subclass with string");
		
	
	}

	
	  public void doRide(int a) {
	  System.out.println("This is from Subclass with int");
	  
	  
	  }
	 
	
	public void doRide(int a, String b) {
		System.out.println("The available values from Sub class for two parameter");
		
		
	}
	

	public final void performUnlock() {
	
		System.out.println("The value from the subclass for unlocking the vehicle");
		
	}

}
