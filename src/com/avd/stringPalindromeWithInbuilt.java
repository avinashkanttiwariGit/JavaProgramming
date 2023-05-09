package com.avd;

public class stringPalindromeWithInbuilt 
{
	public static void main(String[] args) 
	{
		String st="momo soon dad";
		String []wordsAr=st.split(" ");
		
		//System.out.println(words); will give address
		
		for (String word : wordsAr) 
		{
			//System.out.println(word);
			StringBuilder sb = new StringBuilder(word);
			//System.out.println(sbuilder.toString());
			//System.out.println(sbuilder.reverse().toString());
			//System.out.println(sbuilder.reverse());
			String revWord = sb.reverse().toString();
			
			if(word.equals(revWord))
			{
				System.out.println(word+" is a palindrom");
			}
			else System.out.println(word+" is not a palindrom");
	
		}
		
	}
}
