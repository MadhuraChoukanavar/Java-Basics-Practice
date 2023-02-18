package com.jsp.listimple;
import java.util.*;
public class ArrayListImplementation {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
		a.add("50");
		a.add("40");
		a.add("30");
		a.add("80");
		a.add("90");
		a.add("10");
		System.out.println(a);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println(a.size());
		
		

	}

}
