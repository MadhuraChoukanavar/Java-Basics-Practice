package com.jsp.objectCls;
class Address
{
	int HNo;
	String street;
	String landmark;
	String district;
	String country;
	long pincode;
	public Address(int HNo,String street,String landmark,String district,String country,long pincode)
	{
		this.HNo=HNo;
		this.street=street;
		this.landmark=landmark;
		this.district=district;
		this.country=country;
		this.pincode=pincode;
	}
	@Override
	public String toString() {
		return "Address [HNo=" + HNo + ", street=" + street + ", landmark=" + landmark + ", district=" + district
				+ ", country=" + country + ", pincode=" + pincode + "]";
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Address))return false;
		Address A=(Address)obj;
		return this.HNo==A.HNo&&this.street.equals(A.street)&&this.landmark==A.landmark&&this.district==A.district
				&&this.country==A.country&&this.pincode==A.pincode;
	}
}
class StudentInfo
{
	int sid;
	String sname;
	int age;
	Address adr;
	public StudentInfo(int sid, String sname, int age, Address adr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "StudentInfo [sid=" + sid + ", sname=" + sname + ", age=" + age + ", adr=" + adr + "]";
	}
	
	public boolean equals(Object obj)
	{
		if(!(obj instanceof StudentInfo))return false;
		StudentInfo S=(StudentInfo)obj;
		return this.sid==S.sid&&this.sname.equals(S.sname)&&this.age==S.age&&this.adr==S.adr;
	}
}
public class StudentInformationEM
{
	public static void main(String[] args)
	{
		Address a1=new Address(01, "BEML","4th main" , "banglore", "INDIA", 560037);
		Address a2=new Address(01, "BEML", "4th main", "banglore", "INDIA", 560037);
		System.out.println(a1.equals(a2));
		
		
		StudentInfo s1=new StudentInfo(01, "madhura", 20, a2);
		StudentInfo s2=new StudentInfo(01, "madhura", 20, a2);
		System.out.println(s1.equals(s2));
	}
}
