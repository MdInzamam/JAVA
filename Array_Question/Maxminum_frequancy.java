package Array_Question;

public class Maxminum_frequancy {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 1, 5, 4, 2 };
		int temp[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					temp[j] = -1;
				}

			}
			if (temp[i] != -1 && arr[i] != ' ' && count > 1) {
				System.out.println(arr[i] + " --> " + count);
			}
//			if (maxCount < count) {
//				maxCount = count;
//			}

		}
//		for (int j = 0; j < temp.length; j++) {
//			if (temp[j] != -1 && temp[j] == maxCount) {
//				System.out.println(arr[j] + "-->" + temp[j]);
//			}
//		}

	}

}
