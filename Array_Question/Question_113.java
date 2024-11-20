package Array_Question;

public class Question_113 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 6, 3, 2, 2, 5 };
		Many_time(arr);

	}

	public static void Many_time(int arr[]) {
		int temp[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					temp[j] = -1;
				}
				
			}
			if(temp[i] != -1) {
				System.out.println(arr[i] + " " + count);
			}

		}
	}

}
