package com.avd;

public class SortAnArray 
{
	public static void main(String[] args) 
	{
		int[] ar= {56,36,88,47,46};
		int size=ar.length;
		int temp;
		
		for (int i = 0; i < ar.length; i++) 
		{
			
			for(int j=i; j<ar.length;j++)
			{	
				if(ar[i]>ar[j]) 
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
			}
			
		}
		for (int k : ar) {
			System.out.println(k);
		}
		
	}
}
