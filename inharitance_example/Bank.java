package inharitance_example;

public class Bank {
	String bname;
	String Ifsc;
	String bAdd;

	Bank() {
	}

	Bank(String bname, String ifsc, String bAdd) {
		this.bname = bname;
		this.Ifsc = ifsc;
		this.bAdd = bAdd;
	}
}

class Saving_account extends Bank {
	public void saving() {
		System.out.println("This is saving account");
	}
}

class account_no extends Saving_account {
	public void account() {
		int num = 123456789;
		System.out.println("This is account No -> "+num);
	}
}

class saving_detail extends Bank {
	String acName;
	int accNo;
	double Balance;

	saving_detail(String bname, String Ifsc, String bAdd, String acName, int accNo, double Balance) {
		super(bname, Ifsc, bAdd);
		this.acName = acName;
		this.accNo = accNo;
		this.Balance = Balance;
	}
	public void display() {
		System.out.println("This is your Bank Name -> " + bname);
		System.out.println("This is your IFSC -> " + Ifsc);
		System.out.println("This is your Bank Address -> " + bAdd);
		System.out.println("This is your Account type -> " + acName );
		System.out.println("This is your Account Number -> " + accNo);
		System.out.println("This is your Account Balance -> "+ Balance);
		System.out.println("---------------------------------------------------");
	}
}

class loan extends Bank {
	int loanNo;
	double Loan_balance;

	loan(String bname, String ifsc, String bAdd, String acName, int accNo, Double Balance, int loanNo,
			int Loan_balance) {

		super(bname, ifsc, bAdd);
		this.loanNo = loanNo;
		this.Loan_balance = Loan_balance;

	}
	public void display1() {
		System.out.println("This is your Bank Name -> " + bname);
		System.out.println("This is your IFSC -> " + Ifsc);
		System.out.println("This is your Bank Address -> " + bAdd);
		System.out.println("This is your Loan Number -> " + loanNo );
		System.out.println("This is your Loan Balance -> " + Loan_balance);
		System.out.println("---------------------------------------------------");
	}
}

