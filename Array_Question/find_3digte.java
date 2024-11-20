package Array_Question;

public class find_3digte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 522, 6, 3, 222, -110,1000,-1000 };
		Remove_Duplicate(arr);

	}

	public static void Remove_Duplicate(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {	
			if(arr[i] > 99 && arr[i] < 999 || arr[i] < -99 && arr[i] > -999 ) {
				System.out.println(arr[i]);
			}
			
		}
	}

}
