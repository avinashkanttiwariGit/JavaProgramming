package ACProgramOnNumber;

import java.util.Iterator;

public class B1PrintTableWithPattern 
{
	public static void main(String[] args) 
	{
		int rows = 10;
	     int n =5;
	      
	      // Outer loop for rows
	      for(int i = 1; i <= rows; i++) 
	      {
	         // Inner loop for columns
	         for(int j = 1; j <= n; j++) 
	         {
	            // Multiply row by column to get the product
	            int product = i * j;
	            
	            // Print the product with proper formatting
	            System.out.print(product + "\t");
	         }
	         // Move to the next line after each row is printed
	         System.out.println();
	      }
	}
}