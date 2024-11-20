package Array_Question;

public class Question_115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,5,9,14};
		
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = arr[i]+1; j<arr[i+1];j++) {
				System.out.print(j + " ");
			}
		}
	}

}
