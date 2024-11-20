package Method;

public class Question_65_B {

	public static void main(String[] args) {
		int num = 153;
		System.out.println(Arm(num));

	}

	public static int power(int num, int pow) {
		int sum = 1;
		while (0 < pow) {
			sum = sum * num;
			pow--;
		}
		return sum;
	}

	public static int Digit(int num) {
		int count = 0;
		while (0 < num) {
//			int rem = num % 10;
			count++;
			num = num / 10;
		}
		System.out.println(count);
		return count;
	}

	public static boolean Arm(int num) {
		int temp = num;
		int c = Digit(num);
		int sum = 0;
		while (0 < num) {
			int rem = num % 10;
			int pow = power(rem, c);
			sum = sum + pow;
			num = num / 10;
		}
//		System.out.println(sum);
		
		if (temp == sum) {
			return true;
		} else {
			return false;
		}
	}

}
