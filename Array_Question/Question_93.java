package Array_Question;

public class Question_93 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 4, 5, 6, 7 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				sum = sum + arr[i];
			}
		}
		System.out.print(sum);

	}

}
