package Method;

public class Question_58 {

	public static void main(String[] args) {
//		WAP TO PRINT THE STRONG NUMBER B/W 1 TO 1000
//		int num1 = 1;
		int num = 1000;
		Strong_no(num);

	}

	public static void Strong_no(int num) {
		int i = 1;

		while (i <= num) {
			if (Check_No(i)) {
				System.out.println(i);
			}
			i++;
		}

	}

	public static boolean Check_No(int num) {
		int sum = 0;
		int temp = num;
		while (0 < num) {
			int rem = num % 10;
			sum = sum + factorial(rem);
			num = num / 10;
		}
		return sum == temp;
	}

	public static int factorial(int num) {
		int fact = 1;
		int i = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		return fact;
	}
}
