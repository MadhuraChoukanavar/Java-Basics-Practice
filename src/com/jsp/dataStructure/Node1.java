package com.jsp.dataStructure;

public class Node1 {
	Object key;
	Node1 next;
	Node1 left;
	Node1 right;
	 Node1(Object x,Node1 n)
	{
		key=x;
		next=n;
	}
	 Node1(Object e,Node1 left ,Node1 right)
	 {
		 key=e;
		 this.left=left;
		 this.right=right;
	 }
	public Node1(Object e) {
		key=e;
	}
	

}
