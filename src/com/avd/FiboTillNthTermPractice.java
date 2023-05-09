package com.avd;

import java.util.Iterator;

public class FiboTillNthTermPractice 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int n=10;
		int sum;
		
		for (int i = 0; i < n; i++) 
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			
		}
	}
}
