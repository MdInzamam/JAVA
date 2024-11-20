package Object;

public class Book {
	String bname;
	Book(String bname){
		this.bname = bname;
	}
	public boolean equals(Object obj) {
		Book b =(Book) obj;
		if(this.bname .equals(b.bname)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Book b1 = new Book("Java");
		Book b2 = new Book("Java");
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode());
		System.out.println(b1.getClass());

	}

}
