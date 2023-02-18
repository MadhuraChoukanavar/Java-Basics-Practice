 package com.jsp.oops.objectCls;

class rect 
{
	int len;
	int  bre;
	public  void std(int len,int bre)
	{
		this.bre=bre;
		this.len=len;
	}
	
	@Override
	public String toString() {
		return "rect [len=" + len + ", bre=" + bre + "]";
	}

	
}



public class rectangle 
{
	public static void main(String[] args) {
		rect r1=new rect();
		System.out.println(r1.toString()); 
		
	}

}
