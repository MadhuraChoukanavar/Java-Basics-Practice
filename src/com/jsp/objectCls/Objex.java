package com.jsp.objectCls;
class A extends Object
{
	int i;

	@Override
	public String toString() {
		return "A [i=" + i + "]";
	}
	
}
class B
{
}
public class Objex {

	public static void main(String[] args) {
		A a1 =new A();
		System.out.println(a1);
		B b1=new B();
		System.out.println(b1.getClass());
	}

}
