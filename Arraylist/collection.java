package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collection {

	public static void main(String[] args) {
		List c = new ArrayList();
		c.add(25);
		c.add(10);
		c.add(20);
		c.add(11);
		System.out.println(c);
		Collections.sort(c);
		System.out.println(c);
	}

}
