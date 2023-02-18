package com.jsp.oopssundrstanding;

class EmpInfo {
	int Eid;
	String Ename;
	int Eage;
	String gender;
	String Ectc;
	String phno;
	static String EmpCompany;
	static String companyLocation;

	public void addempinfo(int id, String name, int age, String Egender, String ctc, String phone) {
		Eid = id;
		Ename = name;
		Eage = age;
		gender = Egender;
		Ectc = ctc;
		phno = phone;

	}

	public void display() {
		System.out.println(Eid);
		System.out.println(Ename);
		System.out.println(Eage);
		System.out.println(gender);
		System.out.println(Ectc);
		System.out.println(phno);
		System.out.println(EmpCompany);
		System.out.println(companyLocation);
		System.out.println("%%%%%%%%%%%%%%%%%%%");

	}

	public static void changecompanyname(String name) {
		EmpCompany = name;

	}

	public static void changecompanyLocation(String Location) {
		companyLocation = Location;

	}

}

public class madhuraEmp {

	public static void main(String[] args) {

		EmpInfo.EmpCompany = "Microsoft";
		EmpInfo.companyLocation = "marthahalli";

		EmpInfo E1 = new EmpInfo();
		E1.addempinfo(1, "madhura", 23, "female", "5.5", "92804788");
		E1.display();
		EmpInfo E2 = new EmpInfo();
		E2.addempinfo(2, "bhaskar", 22, "male", "4.5", "9244744444");
		E2.display();

		EmpInfo.changecompanyname("instagram");
		EmpInfo.changecompanyLocation("dehli");
		E1.display();
		E2.display();

	}

}
