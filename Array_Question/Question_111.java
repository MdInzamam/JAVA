package Array_Question;

public class Question_111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,5,6,2,3,2,5};
		Duplicate(arr);

	}

	public static void Duplicate(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i]== arr[j]) {
					System.out.print(arr[i]+ " ");
				}
			}

		}
	}

}
