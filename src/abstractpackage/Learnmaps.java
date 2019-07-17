package abstractpackage;

import java.util.ArrayList;
import java.util.List;

public class Learnmaps {

	public static void main(String[] args) {
	
	List<String> arra = new ArrayList<>();
	arra.add("ABS");
	arra.add("ABS1");
	arra.add("ABS2");
	arra.add("ABS3");
	arra.add("ABS4");
	arra.add("ABS5");
	arra.add(0, "element");
	System.out.println(arra.remove("a"));
	System.out.println(arra.contains("ABS"));
	System.out.println(arra.size());
	
	for(String eachelem:arra) {
		System.out.println(eachelem);
	}
	
	

	}

}
