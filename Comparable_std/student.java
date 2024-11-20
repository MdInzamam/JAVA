package Comparable_std;

import java.util.*;

public class student implements Comparable<student> {
	String name;
	int age;
	int roll;

	student(String name, int age, int roll) {
		this.name = name;
		this.age = age;
		this.roll = roll;
	}

	@Override
	public int compareTo(student Std) {
		return this.age - Std.age;
	}

	public static void main(String[] args) {
		ArrayList<student> a = new ArrayList<student>();
		a.add(new student("Mohan", 20, 101));
		a.add(new student("Sohan", 14, 12));
		a.add(new student("Rohan", 21, 11));
		a.add(new student("Aman", 18, 104));
		for (student std : a) {
			System.out.println(std.name + " " + std.age + " " + std.roll);
		}
		System.out.println();
		Collections.sort(a);
		for (student std : a) {
			System.out.println(std.name + " " + std.age + " " + std.roll);
		}
	}
}
