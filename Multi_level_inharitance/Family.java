package Multi_level_inharitance;

public class Family {

	public static void main(String[] args) {
		father d = new father();
		d.eat();
		d.bark();
		System.out.println(d.x + " "+d.y);
		System.out.println("==============================");
		
		Grand_father a = new Grand_father();
		a.eat();
		
		System.out.println("==============================");
		Son  s = new Son();
		s.bark();
		s.eat();
		s.asleep();
		
		
	} 

	}


