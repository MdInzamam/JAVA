package Array_Question;

public class Question_82 {

	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6,7};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i]+ " ");
			}
		}
	}

}
