package AAAPaternProgram;

public class Pattern5 
{
	public static void main(String[] args) 
	{
		int n=5;
		 for (int row = 1; row <= 2*n; row++) 
		 {
			 for (int col  = 1;  col<2*n-row; col++) 
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}
}
