package day5examples;

public class Bank {
	
	public int accountNo = 123456;
	public int pinN = 123;
	public int balanceAmount = 1200;
	
	public void withdrawAmount(int acNo, int pinNo, int wihdrawAmount) {
		if (acNo==accountNo && pinNo ==pinN) {
			balanceAmount = balanceAmount-wihdrawAmount;
			System.out.println("amount withdrawl");
			
		}
		else
			System.out.println("invalid credentials");
	}
	
	public static void main(String[] args) {
		String city = "cbe&chennai&trichy&vellore&tvl";
		String[] cityname = city.split("&");
		
		for (String eachcities:cityname) {
			if (eachcities.charAt(0)== 't')
			System.out.println(eachcities);
		}

		
	}

	public int countChar(String str, char c) {
		
	    int count = 0;

	    for(int i=0; i < str.length(); i++)
	    {    if(str.charAt(i) == c)
	            count++;
	    }

	    return count;
	
		
	}

	

}
