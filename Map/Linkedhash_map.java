package Map;

import java.util.*;

public class Linkedhash_map {

	public static void main(String[] args) {
		Map<Integer,String> m = new LinkedHashMap<Integer,String>();
		m.put(15,"mohan");
		m.put(19,"sohan");
		m.put(12,"rohan");
		m.put(13,"sagar");
		m.put(14,"aman");
		m.put(15, null);
		System.out.println(m);
		System.out.println(m.get(12));
		System.out.println(m.get(15));
		for(Integer i : m.keySet()) {
			System.out.println(i);
		}
		System.out.println();
		for(String j : m.values()) {
			System.out.println(j);
		}
		System.out.println(  );
		for(Map.Entry<Integer,String> k:m.entrySet()) {
			System.out.println(k.getKey() +"\t"+ k.getValue());
		}

	}

}
