package mapsExample;

import java.util.HashMap;
import java.util.Map;

public class Examle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lets do an application of maps 
		//counting char through a string
		
		Map m = new HashMap();
		
		String name = "Comfort Makokha";
		for(char x : name.toCharArray()) {
			if (m.containsKey(x)) {
				int old = (int)m.get(x);
				m.put(x, old+1);
			}
			else {
				m.put(x, 1);
			}
		}
		
		System.out.println(m);
		//to remove an element 
		m.remove('o');
	
		System.out.println(name);

	}

}
