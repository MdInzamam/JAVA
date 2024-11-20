package Array_Question;

import java.util.Scanner;

public class Question_100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr1 = new int[num];
		for (int i = 0; i < num; i++) {
			arr1[i] = sc.nextInt();
		}
		int num1 = sc.nextInt();
		int arr2[] = new int[num - 1];

		for (int j = 0; j < arr1.length; j++) {
			if (j == num1) {
				arr2[j] = arr1[j];
				continue;
			}
			System.out.print(arr1[j] + " ");
		}
	}
}
