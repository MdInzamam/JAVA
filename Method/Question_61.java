package Method;

public class Question_61 {

	public static void main(String[] args) {
		int num = 123575;
		Count_Degit(num);

	}
	public static void Count_Degit(int num) {
		int count = 0;
		while(0 < num) {
			int rem = num % 10;
			count++;
			num = num / 10;
		}
		System.out.println(count);
	}

}
