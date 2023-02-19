package com.jsp.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackReference {

	public static void main(String[] args) {
		String s= "a11b22ccd";
		Pattern p=Pattern.compile("([a-z])([0-9])\\2");
		Matcher m=p.matcher(s);
		while(m.find())
		{
			System.out.println("Output Is " + m.group());	
			
		}
}
}
