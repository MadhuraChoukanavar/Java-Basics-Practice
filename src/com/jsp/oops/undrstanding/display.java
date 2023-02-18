package com.jsp.oops.undrstanding;

public class display {
	int i;

	public void m1() {
	}
}

class A {
	public static void main(String[] args) {

		display d1 = new display();
		System.out.println(d1.i);
		d1.i = 300;
		System.out.println(d1.i);
		System.out.println(d1.i);
		d1.i = 300;
		display d2 = new display();
		d2.i = 500;
		System.out.println(d2.i);
	}
}
