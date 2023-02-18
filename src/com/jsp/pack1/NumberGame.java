
package com.jsp.pack1;
import java.util.Scanner;


public class NumberGame 
{
	public static void main(String[] args)
	{
		
		System.out.println("wel come to Number Game");
		System.out.println("the menu is as bellow");
	for( ; ; )
	{
		System.out.println("1.Factorial \n"
				+ "2.Length\n" 
				+ "3.Power\n"
				+ "4.Amstrong\n"
				+ "5.Strong ");
		System.out.println("enter your choice");
		
		Scanner scn=new Scanner(System.in);
		int choice=scn.nextInt();
		
		
		if(choice==1)
			
		{
			System.out.println("enter the number");
			int num=scn.nextInt();
			if(num<0)
			System.out.println("no negetives please");
			else
			System.out.println(num +"! is = " + utility.factorial(num));
			
		}
		else if(choice==2)
		{
			System.out.println("Enter the number");
			int  num=scn.nextInt();
			if(num<0)
				System.out.println("please enter positve numbers only");
			else
				System.out.println("length of the given number is "+ utility.length(num));
				
		}
		else if(choice==3)
		{
			System.out.println("Enter the number");
			int base=scn.nextInt();
			System.out.println("Enter the number");
			int exp=scn.nextInt();
			if(base<0)
				System.out.println("please enter positve numbers only");
			else
				System.out.println("the power of the given is "+utility.power(base,exp));
		}
		else if(choice==4)
		{
			System.out.println("enter the number ");
			int num=scn.nextInt();
			if(num<0)	
				System.out.println("no negetives please");
			else
			{
				int res =utility.Amstrong(num);
			if(res==num)
				System.out.println("the number is amstrong ");
			else
				System.err.println("the number is not amstrong");
				}
			
				
				
			
		}
		else if(choice==5)
		{
			System.out.println("enter the number ");
			int num=scn.nextInt();
			if(num<0)	
				System.out.println("no negetives please");
			else
			{
				int res =utility.strong(num);
			if(res==num)
				System.out.println("the number is strong ");
			else
				System.err.println("the number is not strong");
			}
			
		}
		else
		{
			System.out.println("enter valid input");
		}
			System.out.println("Do u want to continioue?Y/y");
			char ch=scn.next().charAt(0);
			if(ch=='Y'||ch=='y')continue;
			else
			{
				System.out.println("Thank you for using software");
				System.out.println("try again");
				System.out.println("Have a good day");
			}
		
		}	
	}
	}

	


