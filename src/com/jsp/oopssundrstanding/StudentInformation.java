package com.jsp.oopssundrstanding;

public class StudentInformation 
{
	int stuID;
	String stuName;
	int age;
	String gender;
	String PhNo;
   static String clgName;
   static String collageAddress;
   
   
   public static void display(StudentInformation s)
   {
	System.out.println(s.stuID);
	System.out.println(s.stuName);
	System.out.println(s.age);
	System.out.println(s.gender);
	System.out.println(s.PhNo);
	System.out.println(clgName);
	System.out.println(collageAddress);
	
	   
   }
	
	
	public static void main(String[] args)
	{
			System.out.println("1st Student Information");
		   StudentInformation s1  = new StudentInformation();
		   
		   s1.stuID=001;
		   s1.stuName="Madhura";
		   s1.age=23;
		   s1.gender="Female";
		   s1.PhNo="156548926";
		   StudentInformation.clgName="JSP";
		   StudentInformation.collageAddress="old airport Road";
				   
		   display(s1);
		   
		   System.out.println("2nd Student Information");
		   StudentInformation s2  = new StudentInformation();
		   
		   s2.stuID=002;
		   s2.stuName="Sahana";
		   s2.age=23;
		   s2.gender="Female";
		   s2.PhNo="156548958";
		   display(s2);	  
		   
		   System.out.println("3nd Student Information");
		   StudentInformation s3  = new StudentInformation();
		   
		   s3.stuID=003;
		   s3.stuName="Savita";
		   s3.age=23;
		   s3.gender="Female";
		   s3.PhNo="15654854";
		   display(s3);	
		   
		   
		   
		   System.out.println("4nd Student Information");
		   StudentInformation s4 = new StudentInformation();
		   
		   
		   s4.stuID=004;
		   s4.stuName="aparna";
		   s4.age=23;
		   s4.gender="Female";
		   s4.PhNo="1565485259";
		   
		   display(s4);	
		   
		   
		  
	}

}
