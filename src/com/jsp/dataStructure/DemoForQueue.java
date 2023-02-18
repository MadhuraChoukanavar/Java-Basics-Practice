package com.jsp.dataStructure;

public class DemoForQueue {

	public static void main(String[] args) {
	  Queue q=new Queue();
	  q.add(10);
	  q.add(80);
	  q.add(50);
	  q.add(20);
	  q.add(90);
	  q.add(70);
	    System.out.println(q.size());
	    
	    
	  
	  System.out.println(q.isEmpty());
	  System.out.println(q.peek());
	  System.out.println(q.poll());
	  System.out.println(q.size());
	
			  
   }

}
