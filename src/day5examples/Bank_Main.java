package day5examples;

public class Bank_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Bank bmn = new Bank(); bmn.withdrawAmount(123456, 123, 500);
		 * System.out.println(bmn.balanceAmount);
		 */
		
		String city = "chennai";
//		String value = city.toUpperCase();
//		System.out.println(value);
		
		for (int i=1;i<city.length();i=i+2) {
			char value = city.charAt(i);
			 System.out.println(value);
			 
			String bs= city.join(",",city);
			System.out.println(bs);
			 
			 
			 
			
		}
		
		Bank bl = new Bank();
		bl.countChar("Mathan", 'a');
		System.out.println(bl.countChar("Mthn", 'a'));
		
		
		}
	
	public static int charCou(String name,char c) {
	
		int count=0;
		for (int i=0;i<name.length();i++) {
			if (name.charAt(i) == 'c') {
				count++;
			}
		}
		
		return count;
	}
	
	
}


