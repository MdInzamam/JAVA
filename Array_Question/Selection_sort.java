package Array_Question;

public class Selection_sort {

	public static void main(String[] args) {
		int num[] = { 2, 3, 1, 10, 4, 5, 3, 8, 4 };

		for (int i = 0; i < num.length-1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for (int j = 0; j < num.length; j++) {			
			System.out.print(num[j] +" ");
		}

	}

}
