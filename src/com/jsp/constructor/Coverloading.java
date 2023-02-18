package com.jsp.constructor;

class A12 {
	public A12() {
		this(10);
		System.out.println("no arrgument");
	}

	public A12(int i) {
		this(10, 2.5);
		System.out.println("i is " + i);
	}

	public A12(int i, double j) {
		System.out.println("sum of i and j is" + (i + j));
	}
}

public class Coverloading {

	public static void main(String[] args) {
		A12 a1 = new A12();
	}

}
