package com.jsp.oops.constructor;

class A {
	int sid;
	String name;
	int age;

	public A() {

		sid = 1;
		name = "MyName";
		age = 23;
	}

	public A(int sid) {
		this.sid = sid;
	}

	public A(int sid, int age) {

		this(sid);
		this.age = age;
	}

	public A(int sid, String name, int age) {
		this(sid, age);
		this.name = name;
	}

	public void display() {
		System.out.println(sid);
		System.out.println(name);
		System.out.println(age);
	}

}

public class callToThis {

	public static void main(String[] args) {
		A a1 = new A(1, "My_Name", 23);
		a1.display();

	}
}
