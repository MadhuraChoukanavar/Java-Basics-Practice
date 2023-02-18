package com.jsp.vegetable;
import java.util.Scanner;
public class vegetablecosting 
{
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the veg");
		String vegName=scn.nextLine();
		shopkeeper shop=new shopkeeper();
		vegetable veg=shop.sell(vegName);
		veg.washingveg();
		if (veg instanceof carrot)((carrot)veg).preparHalwa();
		if (veg instanceof potato)((potato)veg).frenchfries();
			
	}
	
}
