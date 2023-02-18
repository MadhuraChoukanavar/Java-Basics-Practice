package com.jsp.constructor;

public class Aa {
	public static void main(String[] args) {
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
	}

	public static void m1() {
		System.out.println("m1 starts");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i % 3 == 0)
				return;
		}
		System.out.println("m1 ends");
	}

}
