package Method;

public class Question_54 {

	public static void main(String[] args) {
//		DESIGN A METHOD TO CALCULATE SUM OF EVEN DIGITS AND RETURN, INSIDE MAIN METHOD
//		CALCULATE SQUARE OF RETURNING RESULT.
		int num = 123456;
		
		int sqr = Sum_Of_Even_Digits(num);
		System.out.println(sqr * sqr);
	}

	public static int Sum_Of_Even_Digits(int num) {
		int i = 1;
		int sum = 0;
		while (i <= num) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				sum = sum + rem;
			}
			num = num / 10;
		}
		return sum;
	}

}
