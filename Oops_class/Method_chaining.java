package Oops_class;

public class Method_chaining {
	int id ;
	String name;
	
	public Method_chaining setid(int id) {
		this.id = id;
		return this;
	}
	public Method_chaining setname(String name) {
		this.name = name;
		return this;
	}
	
	void display()
	{
		System.out.println("Emp id " + id);
		System.out.println("Emp Name "+ name);
	}
	
	public static void main(String[] args) {
		Method_chaining m = new Method_chaining();
		m.setid(101).setname("Sagar").display();

	}

}
