package com.jsp.dataStructure;

import java.util.Arrays;

public class implementComparableToEmployee {

	public static void main(String[] args) {
		    employee [] e=new employee[5];
			e[0]=new employee("SAHANA",001);
			e[1]=new employee("APARNA",002);
			e[2]=new employee("BASSA",003);
			e[3]=new employee("MADHURA",004);
			e[4]=new employee("SAVITA",005);
			Arrays.sort(e);
			for(employee e1:e)
			{
				System.out.println(e1);
			}
		}
	}

  class employee implements Comparable <employee>{
	  	String Ename;
	  	int EID;
	  	public employee(String ename, int eID) {
		super();
		Ename = ename;
		EID = eID;
	}
	  	
  @Override
		public String toString() {
			return "employee [Ename=" + Ename + ", EID=" + EID + "]";
		}

public int compareTo(employee arg) {
//	  String E1=Ename;
//	  employee E2=(employee)arg;
	  return this.Ename.compareTo(arg.Ename);  
  	}
  }

