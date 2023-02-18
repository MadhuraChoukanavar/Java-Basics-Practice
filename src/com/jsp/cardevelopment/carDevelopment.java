package com.jsp.cardevelopment;

public class carDevelopment 
{
	public static void main(String[] args) 
	{
		cardriver driver1=new cardriver();
		System.out.println("Swift car");
		driver1.drive(new swift());
		System.out.println("*****************************************");
		
		System.out.println("audy car");
		driver1.drive(new audy());
		System.out.println("*****************************************");
		
		System.out.println("jagwar car");
		driver1.drive(new jagwar());
		System.out.println("*****************************************");
	}

}
