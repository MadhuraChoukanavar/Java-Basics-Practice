package com.jsp.oops.undrstanding;

public class StudInfo
{
	int EID;
	String EName;
	String phNo;
	String Role;
	String CTC;
	static String companyName;
	static String companylocation;
	
	
	public void display()
	{
		System.out.println(EID);
		System.out.println(EName);
		System.out.println(phNo);
		System.out.println(Role);
		System.out.println(CTC);
		System.out.println(companyName);
		System.out.println(companylocation);
	}
	
	public  void addEmployee(int id, String name, String num, String role,String ctc)
	{
	  EID=id;
	  EName=name;
	  phNo=num;
	  Role=role;
	  CTC=ctc;
	 }
	public static void changeCompanyName(String na)
	{
		 companyName=na;
	}
	public static void changeCompanylocation(String location)
	{
		companylocation=location;
	}
	
	
	
	
	public static void main(String[] args)
	{
		StudInfo.companyName="CAPGIMINAI";
		StudInfo.companylocation="WhiteField";
		
		
		
		StudInfo E1 = new StudInfo();
		E1.addEmployee(001,"Sahana","153846258","Analyst","4LPA");
		E1.display();
		
		StudInfo E2 = new StudInfo();
		E2.addEmployee(002,"aparana","15345583","Analyst1","3.8LPA");
		E2.display();
		
		StudInfo E3 = new StudInfo();
		E3.addEmployee(001,"savita","153846258","Analyst2","3.5LPA");
		E3.display();
		  
		
		StudInfo.changeCompanyName("TCS");
		StudInfo.changeCompanylocation("Marthalli");
		E1.display();
		E2.display();
		E3.display();
		  
		
		
	}

}
