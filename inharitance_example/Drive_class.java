package inharitance_example;

public class Drive_class {

	public static void main(String[] args) {
		saving_detail Sd = new saving_detail("HDFC", "HDFC000123", "Noida", "Saving", 987654321 , 25000.75);
		Sd.display();
		loan l = new loan("HDFC", "HDFC000123", "Noida","Saving",987654321, 25000.75, 12345, 10000);
		l.display1();
		
		Saving_account sa = new Saving_account();
		sa.saving();
		
		account_no an = new account_no();
		an.account();;
		
	}

}
