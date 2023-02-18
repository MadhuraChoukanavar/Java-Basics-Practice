package com.jsp.oopssundrstanding;

class Test {
	int i;
	static int j;

	public void m1() {
		--i;
		++j;
	}

	public void display() {
		System.out.println(j + " " + i);

	}
}

public class InDe {
	public static void main(String[] args) {

		Test t1 = new Test();
		Test t2 = new Test();
		t1.i = 15;
		t1.m1();
		t1.display();
		t2.i = 30;
		t2.m1();
		t2.display();

	}

}
