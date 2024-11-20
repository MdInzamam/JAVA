package Arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class array_list {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(10);
		c.add('A');
		c.add("Mohan");
		c.add(10.12);
		System.out.println(c);
		c.remove('A');
		System.out.println(c);
	}

}
