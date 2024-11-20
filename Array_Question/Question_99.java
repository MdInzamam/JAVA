package Array_Question;

import java.util.Scanner;

public class Question_99 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr1[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr1[i] = sc.nextInt();
			System.out.print(arr1[i] + " ");
		}
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int arr2[] = new int[num];

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == num2) {
				arr1[i] = num3;
			}
			System.out.print(arr1[i] + " ");

		}

	}

}
