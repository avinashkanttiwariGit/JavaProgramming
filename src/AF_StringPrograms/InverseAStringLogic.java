package AF_StringPrograms;

import java.util.Iterator;

public class InverseAStringLogic 
{
	public static void main(String[] args) 
	{
		String str="Avinash";
		System.out.println(str.length());
		int arraySize=str.length();
		
		char[] arChar = new char[arraySize];
		int j=0;
		
		for(int i=arraySize-1;i>=0; i--)                 //6
		{
			System.out.println(str.charAt(i));			//h
			arChar[j]=str.charAt(i);
			j++;
		}
		System.out.println(arChar);
	}
}
