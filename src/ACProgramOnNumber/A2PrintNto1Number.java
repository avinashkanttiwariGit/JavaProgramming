package ACProgramOnNumber;

import java.util.Scanner;

public interface A2PrintNto1Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		for (int i = n; i>=0; i--) 
		{
			System.out.println(i);
		}	
	}
}
