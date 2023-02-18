package com.jsp.oops.vegetable;

public class shopkeeper
{
	public vegetable sell(String vegName)
	{
		if (vegName.equalsIgnoreCase("carrot"))return new carrot();
		if(vegName.equalsIgnoreCase("potato"))return new potato();
		System.out.println(vegName +" is not available");
		return null;
		
		
	}

}
