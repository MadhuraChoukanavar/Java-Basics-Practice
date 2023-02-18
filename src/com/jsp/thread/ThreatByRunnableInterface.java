package com.jsp.thread;

class test2 implements Runnable
{
	public void run()
	{
	for(int i=10;i<=25;i++)	
	{
		System.out.println(i);
	}
	
	}
}

public class ThreatByRunnableInterface {
	public static void main(String[] args) {
		test2 t=new test2();
		test2 t1=new test2();
		Thread T2=new Thread(t);
		Thread T3=new Thread(t1);
		T2.start();
		System.out.println("Hi Welcome");
		for(int  i=30;i<=40;i++)
		{
			System.out.println("2683794322321548298");
		}
	}

}
