package Array_Question;

public class Question_88 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 3, 7, 2 };
		int  max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if(max <arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
