package abstractpackage;

public abstract class Webdriver {
	
	public abstract void click();
	public abstract void sendkeys();
	public abstract void getvalue();
	public void capture(){
		System.out.print("Calling the concrte method from abstract class");
	}
	
}
