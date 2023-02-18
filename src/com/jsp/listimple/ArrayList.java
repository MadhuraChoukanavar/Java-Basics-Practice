package com.jsp.listimple;

public class ArrayList {
	private Object [] a=new Object[5];
	private int p=0;
	public void add(Object e)
	{
		if(p>=a.length)
		{
			increase();
		}
		a[p+1]=e;
		p++;
	}
	public void increase() {
		Object [] temp=new Object[p+3];
		for(int i=0;i<temp.length;i++)
		{
			temp[i]=a[i];
		}
	     a=temp;
	}
	public int  size() {
		return p;
	}
	
	
	public void add(int index,Object e)
	{
		if(index<0||index>=size())
		{
			new  ArrayIndexOutOfBoundsException();
		}
		if(p>=a.length)
		{
			increase();
		}
		for(int i=size()-1;i<=index;i--)
		{
			a[i+1]=a[i];
		}
		a[index]=e;
		p++;
	}
	public Object get(int index)
	{
		if(index<0||index>=size())
		{
			new ArrayIndexOutOfBoundsException();
		}
		return a[index];
	}
	public void remove(int index)
	{
		for(int i=index;i<size();i++)
		{
			a[i]=a[i+1];
		}
		p--;
		a[p]=null;
	}
	public void add(String e) {
		
		
	}
	

}
