package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class List_collection {

	public static void main(String[] args) {
//		List li = new ArrayList();
//		li.add(20);
//		li.add(31);
//		li.add(42);
//		li.add(53);
//		System.out.println(li);
//		for(Object obj : li) {
//			Integer i = (Integer)obj;
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
//	}
		List<Character> li = new ArrayList<Character>();
		li.add('A');
		li.add('B');
		li.add('C');
		li.add('D');
		System.out.println(li);
		for (Object obj : li) {
			Character c = (Character) obj;
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
		}
		
		System.out.println("\n");
		
		List c = new ArrayList();
		c.add('A');
		c.add(10);
		c.add(11);
		c.add('D');
		Object i[] = c.toArray();
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

	}
}
