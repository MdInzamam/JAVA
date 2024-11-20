package constructor;
//No argument constructor

public class car {

	String color;
	static int count = 0;

	car() {
		count++;
		System.out.println("car " + count + " is created");
	}

	public static void main(String[] args) {
		car c1 = new car();
		car c2 = new car();
		car c3 = new car();
	}

}
