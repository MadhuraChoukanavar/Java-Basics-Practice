package com.jsp.dataStructure;

public class Circle {
	int radius;
	Circle(int radius)
	{
		this.radius=radius;
	}
	public int hashCode()
	{
		return radius%10;
	}
	public boolean equals(Object arg)
	{
		if(!(arg instanceof Circle))return false;
		return radius==((Circle)arg).radius;
		
	}
	
	public String toString()
	{
		return "[circle radius"+ radius+"]";
	}
	
}
