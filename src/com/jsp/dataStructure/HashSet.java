package com.jsp.dataStructure;

public class HashSet {
 private Node[] a=new Node[10];
 private int count=0;
 public boolean add(int key)
 {
	 int index=key%10;
	 if(a[index]==null)
	 {
		 a[index]=new Node(key,null);
		 count++;
		 return true;
	 }
	 Node curr=a[index];
	 Node prev=null;
	 while(curr!=null)
	 {
		 if(curr.key==key)return false;
		 prev=curr;
		 curr=curr.next;
	 }
	 prev.next=new Node(key,null);
	 count ++;
	 return true;
 }
 
 public int size()
 {
	 return count;
 }
 
 public void display()
 {
	 for(int i=0;i<a.length;i++)
	 {
		 Node curr=a[i];
		 while(curr!=null);
		 {
			 System.out.println(curr.key+ " ");
			 curr=curr.next;
		 }
		 
	 }
	 System.out.println();
 }
 
}

