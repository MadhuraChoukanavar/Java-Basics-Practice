package com.jsp.twodarray;

public class linearSearch 
{
	public static void main(String[] args) 
	{
		int []	a= {1,2,5,6,8,9,4};
		System.out.println(search(a,6));
		
	}


	
static int search(int[] a,int e)
{
	for (int i=0;i<a.length;i++)
	{
		if(a[i]==e)return i;
	}
	return -1;
}
}


