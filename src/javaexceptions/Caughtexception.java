package javaexceptions;

public class Caughtexception {

	public static void main(String[] args) throws InterruptedException {
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int i[]=new int[4];
		i[5]=12;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	Thread.sleep(122);
		

	}

}
