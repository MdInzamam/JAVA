package constructor;
//parametriz constructor

public class Fruit {
	String name;
	int price;
	String color;

	Fruit() {
		System.out.println("This is no argument constructor \n");
	}

	Fruit(String name) {
		this.name = name;
	}

	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	Fruit(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	void display() {
		System.out.println(this);
		System.out.println("Name of fruit is " + this.name);
		System.out.println("Price of fruit is " + this.price);
		System.out.println("Color of fruit is " + color);
	}

	public static void main(String[] args) {
		Fruit f1 = new Fruit();
		f1.display();
		System.out.println("\n");
		
		Fruit f2 = new Fruit("Banana");
		f2.display();
		System.out.println("\n");
		
		Fruit f3 = new Fruit("Banana", 70);
		f3.display();
		System.out.println("\n");
		
		Fruit f4 = new Fruit("Banana", 70, "Yellow");
		f4.display();

	}
}
