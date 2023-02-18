package com.jsp.dataStructure;

import java.util.Comparator;
import java.util.LinkedList;

public class BinarySearchTreeObject 
{
	private Node1 root=null;
	private int count =0;
	private boolean flag;
	private Comparator comp;
	public BinarySearchTreeObject()
	{
		comp=null;
	}
	public BinarySearchTreeObject(Comparator c)
	{
		comp=c;
	}
	public boolean add(Object e)
	{
		flag =true;
		root=addNode1(root ,e);
		return flag;
	}
	private Node1 addNode1(Node1 n,Object e)
	{
		if(n==null)
		{
			n=new Node1(e);
			count ++;
			return n;
		}
		if(compareObjects(e,n.key)<0)
		{
			n.left=addNode1(n.left, e);		
		}
		else if(compareObjects(e,n.key)>0)
		{
			n.right=addNode1(n.right,e);
		}
		else
		{
			flag=false;
		}
		return n;
		
	}
	
	public int compareObjects(Object o1,Object o2)
	{
		if(comp!=null)return comp.compare(o1, o2);
		Comparable c =(Comparable)o1;
		return c.compareTo(o2);
	}
	public void levelOrder()
	{
		LinkedList<Node1>  q=new LinkedList<Node1>();
		if(root!=null)q.add(root);
		while(!q.isEmpty())
		{
			Node1 n=q.poll(); 
			System.out.print(n.key+" ");
			
			if(n.left!=null)q.add(n.left);
			if(n.right!=null)q.add(n.right);
		}
		
		System.out.println();
	}
	public void preObreTraverse()
	{
		preOrder(root);
		System.out.println();
	}
	private void preOrder(Node1 n)
	{
		if(n==null)return;
		System.out.print(n.key+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	public void postOrder(){
		postOrder(root);
		System.out.println();
	}
	public void postOrder(Node1 n)
	{
		if(n==null)return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+" ");
	}
	

}
