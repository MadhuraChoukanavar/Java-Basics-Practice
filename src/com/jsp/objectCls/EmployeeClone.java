package com.jsp.objectCls;
class Employee
{
	int eid;
	String name;
	long salary;
	public Employee(int eid, String name, long salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() 
	{
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class EmployeeClone
{
public static void main(String[] args)
{
	
	
}
}
