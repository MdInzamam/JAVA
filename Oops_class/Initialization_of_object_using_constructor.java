package Oops_class;

public class Initialization_of_object_using_constructor {

	public static void main(String[] args) {
		fruit f1 = new fruit("Mango",100,"red");
		System.out.println(f1);
		System.out.println(f1.name+" "+f1.price+" "+f1.color);
		System.out.println("==========================================================================================================================");
		fruit f2 = new fruit("Banana",70,"Yellow");
		System.out.println(f2);
		f2.display();

	}

}

