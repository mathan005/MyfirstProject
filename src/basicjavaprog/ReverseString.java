package basicjavaprog;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "MalayalaM";

		
		/*
		 * for(int i=name.length()-1; i>=0; i--) { System.out.print(name.charAt(i)); }
		 * 
		 * 
		 * 
		 * char[] ch = name.toCharArray(); for(int i=name.length()-1; i>=0; i--) {
		 * System.out.print(ch[i]); }
		 */
		
		StringBuilder s = new StringBuilder(name).reverse();
		System.out.println(s);
		
		  if (name.equals(s.toString())) { System.out.println("the text is palindrom"); } else {
		  System.out.println("the text is not a palindrome"); }
		 
		
	}

}
