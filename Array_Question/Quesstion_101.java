package Array_Question;

import java.util.Scanner;

public class Quesstion_101 {

	public static void main(String[] args) {
		System.out.println("Enter array");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		int index = sc.nextInt();
		int arr1 = returnarray(arr,index);
		System.out.println(arr1);
	}

	public static int returnarray(int arr[], int index) {

		return arr[index];

	}

}
