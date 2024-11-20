package Array_Question;

public class Question_98 {

	public static void main(String[] args) {
		int arr [] = {1,2,3,48,5};
		int arr2 [] = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr2[i] = arr[arr.length -1-i];
			System.out.print(arr2[i] + " ");
		}
	}

}
