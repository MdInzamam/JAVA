package Abstract_program;

public abstract class vehicle {

	public abstract void test();

	public abstract void demo();

	public void run() {
		System.out.println("vehicle is running");
		System.out.println("---------------------------------------");
	}

}

abstract class Car extends vehicle {
	public abstract void start();

	public void name() {
		System.out.println("car is running");
		System.out.println();
	}
}

class electricCar extends Car{

	@Override
	public void start() {
		System.out .println("Electric car start");
		
	}

	@Override
	public void test() {
		System.out.println("Electric car start");
		
	}

	@Override
	public void demo() {
		System.out.println("Electric car demo start");
		
	}
	
	public void ride() {
		System.out.println("electric car ride");
		
	}
	
}