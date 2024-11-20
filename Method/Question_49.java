package Method;

public class Question_49 {

	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 20;
		
		if(total_Sum(num1, num2) % 2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
	public static int total_Sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

}
