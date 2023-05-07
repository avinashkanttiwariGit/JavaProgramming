package AAProgramsQS;

import java.util.Scanner;

public class ACNumberOrDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		
		if(n<=9 && n>=-9)
		{
			System.out.println(n+" is a digit");
		}
		else {System.out.println(n+" is a number");}
			
	}
}
