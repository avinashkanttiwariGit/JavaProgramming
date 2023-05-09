package com.avd;

import java.util.Iterator;

public class FiboTillSumIs100 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int sum = 0;
		while (sum < 100) 
		{
			System.out.println(sum);
			a = b;
			b = sum;
			sum=a+b;
		}

	}
}
