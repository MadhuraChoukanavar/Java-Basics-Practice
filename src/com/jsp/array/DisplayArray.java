package com.jsp.array;

/*Utility Class To Display an Array*/
public class DisplayArray {

	public static void displayArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}
	}

	public static void displayArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
