package Interface;

public interface shape {
	int x = 10;

	int findarea();

	void findParameter();
}

class rectangle implements shape {

	@Override
	public int findarea() {
		int l = 20;
		int b = 10;
//		System.out.println(l*b);
		return l * b;
	}

	@Override
	public void findParameter() {
		int l = 8;
		int b = 9;
//		System.out.println(2 * findarea());
		System.out.println(2*(l+b));

	}
}

class circle implements shape {

	@Override
	public int findarea() {
		int r = 4;
		return (int) (3.14 * r * r);
	}

	@Override
	public void findParameter() {
		int r = 5;
		System.out.println(2 * 3.14 * r);

	}

}
