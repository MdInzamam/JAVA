package Array_Question;

import java.util.Scanner;

public class Question_105 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		int num = sc.nextInt();
//		int arr[]= new int[num];
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();	
//		}
//		second_largest(arr);
//	}
		int arr[] = { 2, 7, 1, 44, 2, 6, 3 };
		second_largest(arr);
	}
	public static void second_largest(int arr[]) {
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
		System.out.print(arr[arr.length-2]+ " ");
	}
}
