package AAAPaternProgram;

import java.util.Iterator;
/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class Pattern4 
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int row = 1; row <= n; row++) 
		{
			for (int col = 1; col <=row; col++) 
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}
}
