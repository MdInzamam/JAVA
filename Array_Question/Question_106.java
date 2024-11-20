package Array_Question;

public class Question_106 {

	public static void main(String[] args) {
		int arr[] = { 2, 7, 1, 44, 2, 6, 3 };
		sort_Asce(arr);

	}

	public static void sort_Asce(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");

		}

	}

}