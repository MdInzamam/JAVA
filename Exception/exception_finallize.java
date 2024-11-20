package Exception;

public class exception_finallize {

	public static void main(String[] args)throws InterruptedException, ArithmeticException {
		for(int i =1;i<=10;i++) {
			System.out.println("Hello "+i);
			Thread.sleep(1000);
		}
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Hllo");
	}

}
