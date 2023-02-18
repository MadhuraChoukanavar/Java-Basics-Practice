package com.jsp.oops.undrstanding;

public class StudentInfo {
	int stuID;
	String stuName;
	int age;
	String gender;
	String PhNo;
   static String clgName;
   static String collageAddress;
   
   
   public  void display()
   {
	System.out.println(stuID);
	System.out.println(stuName);
	System.out.println(age);
	System.out.println(gender);
	System.out.println(PhNo);
	System.out.println(clgName);
	System.out.println(collageAddress);
	
	   
   }
	
	
	public static void main(String[] args)
	{
			System.out.println("1st Student Information");
		   StudentInfo s1  = new StudentInfo();
		   
		   s1.stuID=001;
		   s1.stuName="Madhura";
		   s1.age=23;
		   s1.gender="Female";
		   s1.PhNo="156548926";
		   StudentInfo.clgName="JSP";
		   StudentInfo.collageAddress="old airport Road";
				   
		   s1.display();
		   
		   System.out.println("2nd Student Information");
		   StudentInfo s2  = new StudentInfo();
		   
		   s2.stuID=002;
		   s2.stuName="Sahana";
		   s2.age=23;
		   s2.gender="Female";
		   s2.PhNo="156548958";
		   s2.display();	  
		   
		   System.out.println("3nd Student Information");
		   StudentInfo s3  = new StudentInfo();
		   
		   s3.stuID=003;
		   s3.stuName="Savita";
		   s3.age=23;
		   s3.gender="Female";
		   s3.PhNo="15654854";
		   s3.display();	
		   
		   
		   
		   System.out.println("4nd Student Information");
		   StudentInfo s4 = new StudentInfo();
		   
		   
		   s4.stuID=004;
		   s4.stuName="aparna";
		   s4.age=23;
		   s4.gender="Female";
		   s4.PhNo="1565485259";
		   
		   s4.display();	
		   
		   
		  
	}

}



