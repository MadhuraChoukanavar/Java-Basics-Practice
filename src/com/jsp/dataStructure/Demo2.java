package com.jsp.dataStructure;
import java.util.*;
public class Demo2 {
	public static void main(String[] args) {
		
	List<Integer> arrList=new ArrayList<Integer>();
		
		arrList.add(10);
		arrList.add(50);
		arrList.add(20);
		arrList.add(50);
		arrList.add(30);
		arrList.add(10);
		HashSet s=new HashSet();
		for(Integer o:arrList)
		{
			if(s.add(o)==false)
			System.out.println(o);
		}
		
		
	
	}

}
/*
 * class demo3 { public static void main(String[] args) { List arrList=new
 * ArrayList();
 * 
 * arrList.add(10); arrList.add(50); arrList.add(20); arrList.add(50);
 * arrList.add(30); arrList.add(10);
 * 
 * for(Object o:arrList) {
 * 
 * Set s=new HashSet(); if(s.add(o)==false); { System.out.println(o); }
 * 
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * }
 */