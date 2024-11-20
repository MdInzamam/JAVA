package Array_Question;

import java.util.Scanner;

public class Question_86 {

	public static void main(String[] args) {
		boolean size[] = retun_arr(1);
		for (int i = 0; i < size.length; i++) {
			System.out.println(size[i]);	
		}
	
		
	}
	public static boolean[] retun_arr(int size) {
		Scanner sc = new Scanner(System.in);
		boolean a [] = new boolean[size];
		
		for(int i = 0;i<a.length;i++) {
			a[i] = sc.nextBoolean();
		}
		return a;
	}

}
