package Multi_level_inharitance;

public class father extends Grand_father {
	int y = 30;
	int x = 40;
	public void asleep(){
		System.out.println("Dog is sleeping");
	}
	public void bark() {
		System.out.println("Dog is eating");
		System.out.println(super.x);
		System.out.println(this.x);
		super.eat();
		this.asleep();
	}
}
