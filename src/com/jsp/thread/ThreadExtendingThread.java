package com.jsp.thread;



class test1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i +" ");
		}
	}
}
public class ThreadExtendingThread {
	public static void main(String[] args) {
		test1 t=new test1();
		test1 t2=new test1();
		t.setPriority(9);
		t.start();
		System.out.println("Hi All");
		t2.start();
		for(int  i=30;i<=40;i++)
		{
			System.out.println("2683794322321548298");
		}
		System.out.println("Hello World");
	}

}
