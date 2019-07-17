package basicjavaprog;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GetterSetter {

	public static void main(String[] args) {
		Map<String,Integer> mp=new HashMap<String,Integer>();
		mp.put("Date", 10);
		mp.put("month", 1);
		mp.put("Datew",255);
		
		mp.get("month");
	
		
		for(Entry<String, Integer> eachvalue : mp.entrySet()) {
			System.out.println(eachvalue.getKey()+":"+eachvalue.getValue());
			
		}
		
	}
		

		public String setName(String nam1) {
			String name=nam1;
			return name;
		

	}
}

