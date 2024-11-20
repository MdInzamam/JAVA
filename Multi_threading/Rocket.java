package Multi_threading;

public class Rocket implements Runnable {
	public void run() {
		System.out.println("Inside run Method");
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Rocket r1 = new Rocket();
		Rocket r2 = new Rocket();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.setName("Aman");
		t2.setName("Raman");
		
		t1.setPriority(1);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
	}

}
