package com.jsp.oopssundrstanding;

class K {
	int i;

	public void display() {
		System.out.println(i);
	}
}

public class baskar {
	public static void main(String[] args) {
		K k1 = new K();
		K k2 = k1;

		k1.i = 20;
		k2.i = 30;

		k1.display();
		K k3 = k1;
		k2.i = 4;
		k3.display();
	}
}
