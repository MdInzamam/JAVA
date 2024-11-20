package Abstract_program;

public class driver_class {

	public static void main(String[] args) {
		vehicle v1 = new electricCar();
		v1.test();
		v1.demo();
		v1.run();
		Car C = new electricCar();
		C.test();
		C.demo();
		C.run();
		electricCar ec = new electricCar();
		ec.demo();
		ec.name();
		ec.start();
		ec.run();
		ec.ride();
	}

}
