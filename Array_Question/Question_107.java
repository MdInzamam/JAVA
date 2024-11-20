package Array_Question;

public class Question_107 {

	public static void main(String[] args) {
		int arr [] = {33,333,2,5,7};
		int n = second_lowest(arr);
		System.out.println(n);
	}
	public static int second_lowest(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		return arr[1];
	}

}
