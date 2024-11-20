package Oops_class;

public class Non_static_block {
	{
		System.out.println("Non Static block");
	}

	public static void main(String[] args) {
		Non_static_block non1 = new Non_static_block();
		Non_static_block non2 = new Non_static_block();
		Non_static_block non3 = new Non_static_block();
		System.out.println("This is main mathod");
	}

}
