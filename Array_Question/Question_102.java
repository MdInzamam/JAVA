package Array_Question;

import java.util.Iterator;

public class Question_102 {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 6, 2, 6 };
		sort_Array(arr);
	}

	public static void sort_Array(int arr[]) {

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
