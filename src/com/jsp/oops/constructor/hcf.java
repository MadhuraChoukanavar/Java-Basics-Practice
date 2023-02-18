package com.jsp.oops.constructor;

import java.util.Scanner;

public class hcf {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int num = a < b ? a : b;
		for (int i = 1; i <= num; i++) {
			if (a % i == 0 && b % i == 0)
				;
			num = i;
			break;
		}
		System.out.println(num);

	}

}
