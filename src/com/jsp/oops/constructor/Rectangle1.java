package com.jsp.oops.constructor;

class recta {
	int len;
	int bre;
	int area;

	public recta() {
		len = 10;
		bre = 20;

	}

	public recta(int dim) {
		len = dim;
		bre = dim;

	}

	public recta(int len, int bre) {
		this.len = len;
		this.bre = bre;
	}

	public int displayarea() {
		area = len * bre;
		return area;
	}

}

public class Rectangle1 {
	public static void main(String[] args) {
		recta r1 = new recta();
		int R1 = r1.displayarea();
		System.out.println(R1);

		recta r2 = new recta(12);
		int R2 = r2.displayarea();
		System.out.println(R2);

		recta r3 = new recta(1, 8);
		int R3 = r3.displayarea();
		System.out.println(R3);

	}

}
