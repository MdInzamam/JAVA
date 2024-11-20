package Method;

public class Question_62 {

	public static void main(String[] args) {
		int num = 11;
		Prime_No(num);
	}

	public static void Prime_No(int num) {
		int count = 0;
		int i = 1;
		while (i <= num) {
			
			if (num % i == 0) {
				count += 1;
			}
			i++;
		}
		if(count > 2) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Is Prime");
		}
	}
}
