package basicjavaprog;

import java.util.ArrayList;

public class ArrLs {

	public static void main(String[] args) {
	ArrayList<String> ls = new ArrayList<String>();
	
	ls.add("seq");
	ls.add("parell");
	ls.add("in order");
	ls.add("ordereds");
	System.out.println(ls.size());
	
	ls.remove(1);
	System.out.println(ls.contains("in"));
	System.out.println(ls);
	
	for(String AllLs: ls) {
		System.out.println(AllLs);
	}

	}

}
