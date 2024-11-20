package Array_Question;

public class Question_112 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 6, 3, 2, 2, 5 };
		Remove_Duplicate(arr);

	}

	public static void Remove_Duplicate(int arr[]) {
		int temp[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					temp[j] = -1;
				}
			}
			if(temp[i] != -1) {		//1=1 2=3 5=2 6=1 3=1
//			if (temp[i] != -1 && count > 1) {	// 2=3   5=2
				System.out.println(arr[i] + "=" + count);
			}
		}
	}
}
