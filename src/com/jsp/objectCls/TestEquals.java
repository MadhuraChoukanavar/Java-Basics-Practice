  package com.jsp.objectCls;
class AB 
{
	int i;
	public AB(int i)
 {
		super();
		this.i=i;	
}
@Override
public String toString() {
	return "A [i=" + i + "]";
}
public boolean equals(Object obj) 
{
	/*if(obj instanceof AB)
	{
	  AB a=(AB) obj;
	  return this.i==a.i;
	}
	return false;*/
	if(!(obj instanceof AB))return false;
	return this.i==((AB)obj).i;
	
	
}
}
class BA
{
}



public class TestEquals 
{
	public static void main(String[] args) 
	{
		AB a1=new AB(10);
		AB a2=new AB(10);
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a2));
		System.out.println(a1==a2);
		BA b1=new BA();
		System.out.println(a1.equals(b1));
	}

}
