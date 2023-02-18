package com.jsp.oops.constructor;

public class prime {
	public static void main(String[] args) {
		int num = 8;
		if (num <= 1) {
			System.out.println("the number is not prime");
			return;
		}
		if (num > 1) {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					System.out.println("the number is not prime");
					return;
				}
			}

			System.out.println("the number is prime");
			return;

		}
	}
}
