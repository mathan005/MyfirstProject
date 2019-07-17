package basicjavaprog;

public class RemovespecialCharInt {

	public static void main(String[] args) {
	
		String name = "I am a &$^%&be (*&ginn52er to java^%&*& learning";
		
		String repval = name.replaceAll("[^a-zA-Z&]", "");
		System.out.println(repval);
	}

}
