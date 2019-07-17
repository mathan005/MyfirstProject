package basicjavaprog;

public class Removefilasvalues {
	public static void main(String[] args) {
		String name="MayaM";
		
		/*char[] cn = name.toCharArray();
		for(int i=cn.length-1; i>=0;i--) {
			System.out.print(cn[i]);*/
			
			
			/*
			 * for(int i=name.length()-1; i>=0;i--) { System.out.print(cn[i]);}
			 */
		
		/*
		 * String val = name.substring(1,name.length()-1); System.out.println(val);
		 */
		
		StringBuilder sb = new StringBuilder(name).reverse();
		System.out.println(sb);
		
		if (name.equals(sb.toString())) {
			System.out.println("The text is palindrome");
			
		}
		
		else {
			System.out.println("This is not a palindrome");
		}
	}

}
