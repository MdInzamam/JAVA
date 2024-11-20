package Down_casting;

public class Driver_class {

	public static void main(String[] args) {
		fruit f = new mango();
		f.tast();
		 
		
		mango m = (mango) f;
		m.tast();
		m.demo();
		System.out.println(m.price+" "+m.str);

	}

}
