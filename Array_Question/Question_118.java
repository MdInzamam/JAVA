package Array_Question;

public class Question_118 {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 7, 3, 7, 4 };
		int mod = arr.length / 2;
		System.out.println("1st half ");
		for (int i = 0; i < mod; i++) {
			for (int j = i + 1; j < mod; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]);

		}
		System.out.println();
		System.out.println("2 half = ");
		for (int i = mod; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]);
		}
	}
}
