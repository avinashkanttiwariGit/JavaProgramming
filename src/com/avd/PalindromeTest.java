package com.avd;

import java.util.ArrayList;
import java.util.List;

//"mom dad son"
public class PalindromeTest 
{

	public static void main(String[] args) 
	{
		String[] arrStr = {"mom","dad","son"};	
		String str = "mom dad son";
		String[] value = str.split(" ");
		
		for(String val : value) 
		{
			System.out.println(val);
		}
		System.out.println("--------------------");
		
		
		StringBuilder sbuilder = new StringBuilder();
		List<String> strList = new ArrayList<>();
		for(int i= 0 ; i <str.length(); i++) 
		{
			
			if(!(str.charAt(i) == ' '))
			{
				sbuilder.append(str.charAt(i));
			}
			else 
			{
				strList.add(sbuilder.toString());
				sbuilder = new StringBuilder();
			}
		}
		strList.add(sbuilder.toString());
		System.out.println(strList);
		System.out.println("--------------------");
		
		
		
		
		for(String input : arrStr) 
		{			
			StringBuilder sb = new StringBuilder(input);
			sb.reverse();
			String rev = sb.toString();
			if(input.equals(rev)) 
			{
				System.out.println("Given String " +input+ " is Palindrome");
			}
			else 
			{
				System.out.println("Given String " +input+ " is NOT Palindrome");
			}
			
		}

	}

}
