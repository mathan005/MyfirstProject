package basicjavaprog;

public class Bank {

	
	private int accNo = 123;
	
	public int getAccNo() {
		return accNo;
	}


	private int pinNo = 123;
	private int balAmt = 100000;
	
	
	public void withdraAmt(int acNo, int pNo, int bal ) {
		
		if(acNo==accNo && pNo==pinNo) {
		
			if (bal<=balAmt) {
				bal = balAmt-bal;
				System.out.println(bal);
				System.out.println("Amount withdrawd");
			}
			else {
				System.out.println("Insufficient balance");
			}
			
			
			
		}
		
		else {
			System.out.println("Invalid credentials");
			
		}
	}
		
		
		
		

}
