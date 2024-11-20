package Linked_list;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(12);
		li.add(30);
		li.addFirst(100);
		li.addLast(101);
		System.out.println(li);
		System.out.println(li.getFirst());
		Object l1 = li.getLast();
		System.out.println(l1);

	}

}
