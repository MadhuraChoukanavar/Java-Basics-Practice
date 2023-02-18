package com.jsp.dataStructure;

public class Node2
{
	int key;
	Node2 left;
	Node2 right;
	Node2(int k)
	{
		key=k;
	}
	Node2(int k,Node2 left,Node2 right)
	{
		key=k;
		this.left=left;
		this.right=right;
	}

}
