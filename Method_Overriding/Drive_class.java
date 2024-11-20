package Method_Overriding;

public class Drive_class {

	public static void main(String[] args) {
		vehicle v1 = new vehicle();
		v1.run();

		car c = new car();
		c.run();

		vehicle v2 = new car();
		v2.run();
	}
}
