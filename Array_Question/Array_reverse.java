package Array_Question;

public class Array_reverse {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 6, 7, 8, 9 };
		int len = arr.length;
		int temp[] = new int[len];

		for (int i = len - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
