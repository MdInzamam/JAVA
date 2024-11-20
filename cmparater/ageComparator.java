package cmparater;

import java.util.Comparator;

public class ageComparator implements Comparator<Employ> {

	@Override
	public int compare(Employ o1, Employ o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}

}
