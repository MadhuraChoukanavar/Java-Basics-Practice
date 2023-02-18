package com.jsp.dataStructure;

public class DemoForHashSetObject {
	public static void main(String[] args) {
		Circle c1=new  Circle(30);
		Circle c2=new  Circle(20);
		Circle c3=new  Circle(20);
		Circle c4=new  Circle(21);
		System.out.println("hashcode of c1 = "+ c1.hashCode());
		System.out.println("hashcode of c2 = "+ c2.hashCode());
		System.out.println("hashcode of c3 = "+ c3.hashCode());
		System.out.println("hashcode of c4 = "+ c4.hashCode());
		HashSetObject s=new HashSetObject();
		s.add(c1);
		s.add(c2);
		s.add(c3);
		s.add(c4);
		System.out.println(s.size());
		s.display();
		//System.out.println(s);
	}

}
