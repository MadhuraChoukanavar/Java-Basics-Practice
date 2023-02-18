package com.jsp.dataStructure;

import java.util.Arrays;

class circle1 implements Comparable
{
	int radius;
	public circle1(int r)
	{
	 radius = r;
	}

public int compareTo (Object arg) {
	return radius-((circle1)arg).radius;
}

@Override
public String toString() {
	return "circle [radius=" + radius + "]";
}

}
public class OverrideCompareToMycls {
	public static void main(String[] args) {
		circle1 [] a=new circle1[5];  
		a[0]=new circle1(50);
		a[1]=new circle1(60);
		a[2]=new circle1(10);
		a[3]=new circle1(80);
		a[4]=new circle1(20);
		Arrays.sort(a);
		for (circle1 c:a)
		{
			System.out.println(c);
		}
		
		}
  
}
