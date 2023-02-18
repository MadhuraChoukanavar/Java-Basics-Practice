package com.jsp.oops.pack1;
import java.util.Scanner;

public class FirstJavaExample
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scn.nextInt();
		if (num<0)
			{
				System.out.println("sir please enter positive number");
			}
			else
			{
				int fact=1;
				for(int i=1;i<=num;i++)
				{
			       fact=fact*i;
				}	System.out.println(fact);
			}
			
		}
		
	}


