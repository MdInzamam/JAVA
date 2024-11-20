package Array_Question;

public class Question_120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 6, 7, 8, 28, 19 };
		for (int i = 0; i < num.length; i++) {
			if (perfect_no(num[i])) {
				System.out.print(num[i] + " ");
			}
		}

	}

	public static boolean perfect_no(int num) {
		int i = 1;
		int temp = num;
		int sum = 0;
		while (i < num) {
			if (num % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == temp) {
			return true;
		} else {
			return false;
		}
	}

}
