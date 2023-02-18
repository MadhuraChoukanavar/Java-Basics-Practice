package com.jsp.constructor;

class R {
	int len, bre;

	public R() {
		len = 10;
		bre = 20;
	}

	public R(int n) {
		this(n, n);
	}

	public R(int n, int b) {
		this.len = n;
		this.bre = b;
	}

	public void area() {
		int area = len * bre;
		System.out.println(area);
	}
}

public class Rect {
	public static void main(String[] args) {
		R r1 = new R(10);
		r1.area();
	}

}
