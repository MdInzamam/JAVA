package Array_Question;

public class Question_116 {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 6, 7 };
		int sum = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			sum = arr[i] + arr[i + 1];
			System.out.print(sum + " ");
		}

	}
}
