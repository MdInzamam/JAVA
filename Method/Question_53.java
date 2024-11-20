package Method;

public class Question_53 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;

		System.out.println(sum_Of_Num(num));
	}

	public static int sum_Of_Num(int num) {
		int i = 1;
		int rem = 0;
		int sum = 0;

		while (i <= num) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
	}
}
