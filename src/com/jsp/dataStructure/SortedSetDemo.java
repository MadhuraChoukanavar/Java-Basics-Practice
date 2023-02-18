package com.jsp.dataStructure;

import java.util.*;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add(10);
		s.add(50);
		s.add(70);
		s.add(60);
		s.add(30);
		s.add(60);
		
		
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s);
		
		System.out.println(s.headSet(50));
		System.out.println(s.tailSet(50));
		System.out.println(s.subSet(30,60));
		
			
	}

}
