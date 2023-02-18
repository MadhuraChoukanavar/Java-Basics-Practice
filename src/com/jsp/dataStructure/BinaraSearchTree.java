package com.jsp.dataStructure;

public class BinaraSearchTree {
	private Node2 root=null;
	private int count =0;
	private boolean flag;
	
	
	public boolean add(int k)
	{
		flag=true;
		root=addNode(root,k);
		return flag;
	}
	public Node2 addNode(Node2 n,int k)
	{
		if(n==null)
		{
			n=new Node2(k);
			count ++;
			return n;
		}
		if(k<n.key)
		{
			n.left=addNode(n.left,k);
		}
		else if(k>n.key)
		{
			n.right=addNode(n.right,k);
		}
		else
		{
			flag=false;
		}
		return n;
		
	}
	
	public int size ()
	{
		return count;
	}
	

}
