package Array_Question;

public class Question_117 {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 7, 7 };
		int big = arr[0] + arr[1];
		int sum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			sum = arr[i] + arr[i + 1];
			System.out.print(sum + " ");
			if (big < sum) {
				big = sum;
			}
		}
		System.out.println();
		System.out.print(big + " ");
	}
}
