package basicjavaprog;

public class StringBuildBuffer {

	public static void main(String[] args) {
	
//	StringBuilder name = new StringBuilder("Welcome");
	StringBuffer name = new StringBuffer("Welcome");
	
	name.append(" home");
//	name.reverse();
	name.replace(8,8,"to ");
	name.insert(10, " my");
	name.delete(15, 21);
//	name.deleteCharAt();
	System.out.println(name);
	System.out.println(name.length());

	}

}
