package Encapsulation;

public class Company {
	private String Name;
	private int Eid;
	private double sal;

//	public String getName() {
//		return Name;
//		
//	}
//
//	public void setName(String name) {
//		Name = name;
//	}
//
//	public int getEid() {
//		return Eid;
//	}
//
//	public void setEid(int eid) {
//		Eid = eid;
//	}
//
//	public double getSal() { //getter == display 
//		return sal;
//	}
//
//	public void setSal(double sal) {
//		this.sal = sal;
//	}
	
	public void getter() { //getter == display
		System.out.println("Emp name "+ Name);
		System.out.println("Eid name "+ Eid);
		System.out.println("Sal name "+ sal);
	}

	public void setter(String Name,int Eid,double sal) {
		this.sal = sal;
		this.Eid = Eid;
		this.Name = Name;
	}

	public static void main(String[] args) {
		Company c = new Company();
		
//		c.setter("Mohan",121,1000000);
//		c.getter();
		
//		c.setter();
//		System.out.println(c.getName());
		
//		c.setEid(111);
//		System.out.println(c.getEid());
	}

}
