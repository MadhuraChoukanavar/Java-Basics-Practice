package com.jsp.objectCls;
class student implements Cloneable
{
	int sid;
	String name;
	int age;
	public student(int sid, String name, int age) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		
		return super.clone();
	}
	
}

public class StudentCloning 
{
	public static void main(String[] args) throws CloneNotSupportedException {
		student s1=new student(01, "raj", 20);
		System.out.println(s1.toString());
		
		student s2=(student)s1.clone();
		System.out.println(s2);
		//cloneNotSupportedExceptions 
	}

}
