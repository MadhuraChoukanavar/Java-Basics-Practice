package com.jsp.array;

public class DaysWeeks {
	public static void main(String[] args) {
		String[] daysOfTheWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday" };
		String days = "";

		for (String days1 : daysOfTheWeek) {
			if (days1.length() > days.length()) {
				days = days1;
			}
		}

		System.out.println(days);

		/*
		 * for(int i=0;i<daysOfTheWeek.length;i++) {
		 * System.out.println(daysOfTheWeek[i]); }
		 */

		/* Using the static function to Display Array */
		DisplayArray.displayArray(daysOfTheWeek);
	}

}
