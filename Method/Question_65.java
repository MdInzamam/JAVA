package Method;

public class Question_65 {

	public static void main(String[] args) {
//		.WAP TO CHECK NO IS ARMSTRONG NUMBER.
		
		int num = 1634;
		System.out.println(Armstrong(num));
	}

	public static boolean Armstrong(int num) {
		int temp = num;
		int c = count_Degit(num);
		int sum = 0;
		while (0 < num) {
			int rem = num % 10;
			int pow = power(rem, c);
			sum = sum + pow;
			num = num / 10;
		}

		if (temp == sum) {
			return true;
		} else {
			return false;
		}

	}

	public static int count_Degit(int num) {
		int i = 1;
		int count = 1;
		while (i <= num) {
			int rev = num % 10;
			count = count + 1;
			num = num / 10;
			i++;
		}
		return count;
	}

	public static int power(int num, int pow) {
		int sum = 1;
		while (0 < pow) {
			sum = sum * num;
			pow--;
		}
		return sum;

	}
}
