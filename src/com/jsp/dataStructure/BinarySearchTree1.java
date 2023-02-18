package com.jsp.dataStructure;

import java.util.LinkedList;

public class BinarySearchTree1 {

		private Node2 root=null;
		private int count=0;
		private boolean flag=false;
		
		public boolean add(int k)
		{
			flag=true;
			root=addNode(root,k);
			return flag;
		}
		
		private Node2 addNode(Node2 n,int k)
		{
			if(n==null)
			{
				n=new Node2(k);
				count++;
				return n;
			}
			if(k<n.key)
			{
				n.left=addNode(n.left, k);		
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
		public int size() {
			return count;
		}
		
		public void levelOrder()
		{
			LinkedList<Node2>  q=new LinkedList<Node2>();
			if(root!=null)q.add(root);
			while(!q.isEmpty())
			{
				Node2 n=q.poll(); 
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
		private void preOrder(Node2 n)
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
		public void postOrder(Node2 n)
		{
			if(n==null)return;
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.key+" ");
		}

}
