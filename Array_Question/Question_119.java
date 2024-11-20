package Array_Question;

public class Question_119 {

	public static void main(String[] args) {
		int arr[] = { 3, 6, 7, 9, 5, 11 };
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			if (prime(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print("}");
	}

	public static boolean prime(int num) {
		int i = 1;
		int count = 0;
		while (i <= num) {
			if (num % i == 0) {
				count++;
			}
			i++;
		}
		if (count > 2) {
			return false;
		} else {
			return true;
		}
	}
}
