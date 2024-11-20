package Method;

public class Question_56 {

	public static void main(String[] args) {
//		WAP TO DESIGN A METHOD TO RETURN FACTORIAL OF EACH DIGIT IN A NUMBER AND CALCULATE
//		SUM.->IN CLASS.

		int num = 1234;

		System.out.println(FACTORIAL(num));
	}

	public static int FACTORIAL(int num) {
		int i = 1;
		int sum = 0;
		int fact = 1;
		while (i <= num) {
			int rem = num % 10;
			while (i <= rem) {
				fact = fact * i;
				sum = sum + fact;
				i++;
			}
			num = num / 10;
		}
		return sum;
	}

}
