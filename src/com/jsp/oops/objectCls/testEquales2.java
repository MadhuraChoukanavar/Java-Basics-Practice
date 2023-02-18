package com.jsp.oops.objectCls;
class rectangle1
{
	int len;
	int bre;
	public rectangle1(int len, int bre)
	{
		super();
		this.len = len;
		this.bre = bre;
	}
	@Override
	public String toString() {
		return "rectangle [len=" + len + ", bre=" + bre + "]";
	}
	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof rectangle1)) return false;
		rectangle1 r=(rectangle1)obj;
		return this.len==r.len && this.bre==r.bre; 
	}
}
class triangle
{
	}
public class testEquales2 
{
	public static void main(String[] args) 
	{
		rectangle1 r1=new rectangle1(10, 20);
		System.out.println(r1.toString());
		rectangle1 r2=new rectangle1(10,20);
		r2.toString();
		System.out.println(r1.equals(r2));
		System.out.println(r1==r2);
		
		triangle t1=new triangle();
		System.out.println(r1.equals(t1));
				
		
		
	}

}
