package Finalize;

public class Student {
	String name;
	int roll;
	int age;
	
	Student(String name,int age,int roll){
	this.name =name;
	this.age= age;
	this.roll=roll;
	}
	public String toString() {
		return name+" "+roll+" "+age;
	}

	protected void finalize() throws Throwable{
		System.out.println("Detach all connectivity");
		System.out.println("Detach all data base connectivity");
	}
	public static void main(String[] args) {
		Student s1  = new Student("Mohan",101,12);
		Student s2  = new Student("Mohan",101,121);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		System.out.println(s1);
		System.out.println(s1.toString());
		s1 = null;
		System.out.println(s1);
		System.gc();
		
		

	}

}
