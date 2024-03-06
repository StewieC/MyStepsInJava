package linkedmaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// maintains the same order
		Map<String, Comparable> m = new LinkedHashMap<String, Comparable>();
		
		m.put("my name", "stewie");
		m.put("years", 20);
		
		System.out.println(m);
		
		

	}

}
