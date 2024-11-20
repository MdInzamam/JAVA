package Multi_threading;

import Abstract_program.vehicle;

public class Extend_Thread_Vehicle extends Thread {
	public void run() {
		System.out.println("Inside run Method");
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Extend_Thread_Vehicle v1 = new Extend_Thread_Vehicle();
		Extend_Thread_Vehicle v2 = new Extend_Thread_Vehicle();
		
		v1.setName("Car");
		v2.setName("Bike");
		v1.setPriority(1);
		v2.setPriority(10);
		v1.start();
		v2.start();
	}

}
