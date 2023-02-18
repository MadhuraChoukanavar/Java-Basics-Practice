package com.jsp.oops.objectCls;
class Stud
{
	int sid;
	String name;
	int age;
	public Stud(int sid, String name, int age) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Stud [sid=" + sid + ", name=" + name + ", age=" + age + "]";
	}
	public boolean equals(Object obj)
	{
		/*if(!(obj instanceof Stud))return false;
		Stud s=(Stud) obj;
		return this.sid==s.sid && this.name==s.name && this.age==s.age;*/
		
		if(!(obj instanceof Stud))return false;
		Stud s=(Stud) obj;
		return this.sid==s.sid && this.name.equals(s.name)&&this.age==s.age;
	}
	
	
}

public class Studentclass
{
public static void main(String[] args) 
{
	Stud s1=new Stud(01, "raj", 20);
	Stud s2=new Stud(01, "raj", 20);
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s1));
	
	
}
}
