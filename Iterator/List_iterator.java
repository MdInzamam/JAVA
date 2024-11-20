package Iterator;

import java.util.*;

public class List_iterator {

	public static void main(String[] args) {
		List m = new ArrayList();
		m.add(15);
		m.add(19);
		m.add(12);

		m.add("Mohan");
		ListIterator itr = m.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("==========================================================================");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
