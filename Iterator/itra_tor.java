package Iterator;

import java.util.*;

public class itra_tor {

	public static void main(String[] args) {
		Set m = new HashSet();
		m.add(15);
		m.add(19);
		m.add(12);
		m.add(13);
		m.add(14);
		m.add("Mohan");
		Iterator n = m.iterator();
//		System.out.println(n.hasNext());
//		System.out.println(n.next());
		while(n.hasNext()){
			System.out.println(n.next());
		}
	}

}
