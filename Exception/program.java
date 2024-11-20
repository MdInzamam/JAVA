package Exception;

public class program {

	public static void main(String[] args) {
		System.out.println("Hllo");
		int arr [] = {3,4,5};
//		System.out.println(10.0/0);
//		System.out.println(10/0);
//		System.out.println("Hi");
		
		try {
			System.out.println(10/0);
		}

		catch(Exception e)
		{
//			System.out.println(e);
//			e.printStackTrace();
			System.out.println("Please enter right number");
		}
		try {
			System.out.println(arr[2]);
		}

		catch(Exception e)
		{
//			System.out.println(e);
//			e.printStackTrace();
			System.out.println("Please enter right number");
		}
		System.out.println("Hi");
	}

}
