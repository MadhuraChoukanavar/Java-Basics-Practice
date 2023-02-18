package com.jsp.constructor;

class Copy {
	int i;
	int j;

	public Copy() {
		i = 10;
		j = 20;
		System.out.println(i + "and" + j);
	}

	public Copy(Copy a, Copy b) {
		i = a.i;
		j = b.j;
		System.out.println(i + " and " + j);
	}
}

public class copyconstr {
	public static void main(String[] args) {
		Copy c1 = new Copy();
		Copy c2 = new Copy(c1, c1);
	}
}
