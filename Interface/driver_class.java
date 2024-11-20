package Interface;

public class driver_class {

	public static void main(String[] args) {
		shape s = new rectangle();
		int area = s.findarea();
		System.out.println(area);
		s.findarea();
		s.findParameter();

	}

}
