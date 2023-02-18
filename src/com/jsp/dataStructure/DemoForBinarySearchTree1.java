package com.jsp.dataStructure;


public class DemoForBinarySearchTree1 {
	public static void main(String[] args) {
		BinarySearchTree1 b=new BinarySearchTree1();
		b.add(50);
		b.add(30);
		b.add(70);
		b.add(10);
		b.add(40);
		b.add(60);
		b.add(80);
		
		b.levelOrder();
				
	}
}
