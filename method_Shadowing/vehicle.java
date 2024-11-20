package method_Shadowing;

public class vehicle {
	public static void run() {
		System.out.println("Vehicle is runing");
	}
}
class car extends vehicle{
	public static void run() {
		System.out.println("car is runing");
	}
}
