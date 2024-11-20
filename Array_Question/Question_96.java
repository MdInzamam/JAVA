package Array_Question;

public class Question_96 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int sum = 0;
		int tot = arr.length;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		System.out.print(sum / tot);

	}

}
