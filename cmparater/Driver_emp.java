package cmparater;

import java.util.*;

public class Driver_emp {

	public static void main(String[] args) {
		ArrayList<Employ> a = new ArrayList<Employ>();
		a.add(new Employ("Mohan", 111, 20));
		a.add(new Employ("rohan", 110, 21));
		a.add(new Employ("sohan", 11, 29));
		a.add(new Employ("aman", 111, 23));
		a.add(new Employ("raman", 108, 24));

		for (Employ e : a) {
			System.out.println(e.name + " " + e.id + " " + e.age);
		}
		System.out.println("===============================");
		
		Collections.sort(a, new ageComparator());
		for (Employ e : a) {
			System.out.println(e.name + " " + e.id + " " + e.age);
		}
		System.out.println("================================");
		
		Collections.sort(a, new NameComparator());
		for (Employ e : a) {
			System.out.println(e.name + " " + e.id + " " + e.age);
		}
	}

}
