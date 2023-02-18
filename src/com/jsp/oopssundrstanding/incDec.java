package com.jsp.oopssundrstanding;

import java.util.Scanner;

public class incDec {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the  number");
		int i = scn.nextInt();
		int a = ++i + i-- + i--;
		System.out.println(a);
		a = i++ + i++;
		System.out.println(i);

	}

}
