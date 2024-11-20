package Method_Overriding;

public class vehicle {
	public void run() {
		System.out.println("This is vehicle");
	}
}
class car extends vehicle{
	public void run() {
		System.out.println("This is car");
	}
}
