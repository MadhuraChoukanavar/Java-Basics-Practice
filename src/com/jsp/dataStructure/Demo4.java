package com.jsp.dataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo4 {
	public static void main(String[] args) {
		List arrList=new ArrayList();
		
		arrList.add(10);
		arrList.add(50);
		arrList.add(20);
		arrList.add(50);
		arrList.add(30);
		arrList.add(10);
		
		for(Object o:arrList)
		{
			
			Set s=new HashSet();
			if(s.add(o)==false);
			{
			System.out.println(o);
			}
			
			
		}
		
	
		
	}
	
	
	
	

}
