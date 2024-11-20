package Array_Question;

public class Question_89 {

	public static void main(String[] args) {
		int arr[] = {1,2,0,2,4,7};
		int smallest = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(smallest > arr[i]) {
			smallest = arr[i];
			}
		}
		System.out.println(smallest);
	}

}
