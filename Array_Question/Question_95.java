package Array_Question;

public class Question_95 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 4, 5, 6, 7 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
		}
		System.out.print(max);
	}

}
