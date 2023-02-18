package com.jsp.dataStructure;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMap1 {

	public static void main(String[] args) {
		String s1=new String("java");
		String s2=new String("java");
		
		HashMap m=new HashMap(); m.put(s1, 50); 
		System.out.println(m.get(s2));
		 
		IdentityHashMap m1=new IdentityHashMap();
		m1.put(s1,50);
		System.out.println(m1.get(s2));
		System.out.println(m1.get(s1));
		

	}

}
