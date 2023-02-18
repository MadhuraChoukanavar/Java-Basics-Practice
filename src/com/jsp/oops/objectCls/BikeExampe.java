package com.jsp.oops.objectCls;
class Engine
{
 String engineName;
 int hp;
 int yOm;
 
public Engine(String engineName, int hp, int yOm)
{
	super();
	this.engineName = engineName;
	this.hp = hp;
	this.yOm = yOm;
}
@Override
public String toString() {
	return "Engine [engineName=" + engineName + ", hp=" + hp + ", YOP=" + yOm + "]";
}
 public boolean equals(Object obj)
	{
		if(!(obj instanceof Engine))return false;
		Engine E=(Engine)obj;
		return this.engineName==E.engineName&&  this.hp==E.hp&& this.yOm==E.yOm;
	}
}
class bike
{
	String name;
	double price;
	Engine eng;
	public bike(String name, double price, Engine eng)
	{
		super();
		this.name = name;
		this.price = price;
		this.eng = eng;
	}
	@Override
	public String toString() {
		return "bike [name=" + name + ", price=" + price + ", eng=" + eng + "]";
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof bike))return false;
		bike b=(bike)obj;
		return this.name==b.name&&this.price==b.price&& this.eng==b.eng;		
	}
}
public class BikeExampe 
{
	public static void main(String[] args)
	{
		Engine e1=new Engine("ford", 10000, 2015);
		Engine e2=new Engine("ford", 10000, 2015);
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
		bike b1=new bike("apachi", 95000, e2);
		bike b2=new bike("apachi", 95000, e2);
		System.out.println(b1.equals(b2));
	}
}
