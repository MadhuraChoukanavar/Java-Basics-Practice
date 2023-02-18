package com.jsp.pack1;

import java.util.Scanner;

public class ICICI {
	int balance=20000;
	
	public void checkbalance()
	{
		System.out.println(balance);
	}
	public void widthdraw(int amount)
	{
		if(amount >balance)System.out.println("insafficient balance");
		else
			{
			balance=balance-amount;
			
			}
	}
	
	

	public static void main(String[] args) {
		
		
		
		ICICI cst1=new ICICI();
		ICICI phonePay=cst1;
		ICICI googlePay=cst1;
		ICICI paytm=cst1;
		
		phonePay.widthdraw(2000);
		phonePay.checkbalance();
		googlePay.checkbalance();
		paytm.checkbalance();
	}

}
