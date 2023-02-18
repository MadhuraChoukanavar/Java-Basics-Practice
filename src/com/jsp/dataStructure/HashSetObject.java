package com.jsp.dataStructure;

public class HashSetObject {
private Node1[] a=new Node1[10];
private int count =0;

public boolean add(Object e)
{
	int index=e.hashCode()%10;
	if(a[index]==null)
	{
		a[index]=new Node1(e,null);
		count ++;
		return true;
	}
	Node1 curr=a[index];
	Node1 prev=null;
	while(curr!=null)
	{
		if(e.equals(curr.key))return false;
		prev=curr;
		curr=curr.next;
	}
	prev.next=new Node1(e,null);
	count++;
	return true;
	}
	public int size()
	{
		return count;
	}
	public void display () {
		for(int i=0;i<a.length;i++)
		{
		Node1 curr=a[i];
		while(curr!=null)
		{
			System.out.println(curr.key+" ");
			curr=curr.next;
		}
		
		
		
		}
	}

}
