
package com.jsp.pack1;
import java.util.Scanner;

public class utility
{
	
	public static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++) fact=fact*i;
		return fact;
	}
	
	public static  int length(int num )
	{
	int len=0;
	for( ; num>0;num=num/10)len++;
	return len;
	}
	
	public static int power(int base , int exp)
	{
		int pow=1;
	for(int i=1;i<=exp;i++) pow=pow*base;
	return pow;
	}
	
	public static int Amstrong(int num)
	{
		int lenNum=length(num);
		int res=0;
		for( ;num>0;num=num/10)res=res+power(num%10,lenNum);
		return res;
	}
	public static int strong(int num)
	{

		int res=0;
		for( ;num>0;num=num/10)res=res+factorial(num%10);
		return res;
	} 
}


