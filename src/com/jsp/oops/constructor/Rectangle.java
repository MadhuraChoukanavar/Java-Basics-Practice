package com.jsp.oops.constructor;

class Rectang {
	int len;
	int bre;
	int area;

	public Rectang() {
		len = 10;
		bre = 20;
	}

	public Rectang(int dem) {
		len = dem;
		bre = dem;
	}

	public Rectang(int lent, int bret) {
		len = lent;
		bre = bret;
	}

	public void display() {
		area = len * bre;
		System.out.println("length and breadth of the reactangle is " + len + " and " + bre);
		System.out.println("area of reactangle is " + area);
	}
}

public class Rectangle {
	public static void main(String[] args) {
		Rectang R1 = new Rectang();
		R1.display();

		Rectang R2 = new Rectang(12);
		R2.display();

		Rectang R3 = new Rectang(1, 8);
		R3.display();

	}

}
