package constructor;

public class Laptop {
	String Name;
	int price;
	int ram;
	String color;

	Laptop() {
		System.out.println("Laptop Specifecation");
	}

	Laptop(String name) {
		this();
		this.Name = name;
	}

	Laptop(String name, int price) {
		this(name);
		this.price = price;
	}

	Laptop(String name, int price, int ram) {
		this(name, price);
		this.ram = ram;
	}

	Laptop(String name, int price, int ram, String color) {
		this(name, price, ram);
		this.color = color;
	}

	void display() {
		System.out.println("Name of Laptop " + Name);
		System.out.println("Name of Laptop " + price);
		System.out.println("Name of Laptop " + ram);
		System.out.println("Name of Laptop " + color);
		System.out.println(
				"----------------------------------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		Laptop L1 = new Laptop("Hp", 50000, 16, "Black");
		L1.display();
		Laptop L2 = new Laptop("Dell", 50000, 16, "Black");
		L2.display();

	}

}
