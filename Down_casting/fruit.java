package Down_casting;

public class fruit {
	int price = 100;
	
	public void tast() {
		System.out.println("fruit is testy");
	}
}
class mango extends fruit {
	String str = "Yellow";
	public void demo() {
		System.out.println("Mango is testy");
	}
}