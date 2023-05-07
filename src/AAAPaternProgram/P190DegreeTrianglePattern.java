package AAAPaternProgram;

public class P190DegreeTrianglePattern 
{
	public static void main(String[] args) 
	{
		int n=9;
		for(int row=1; row<=n; row++)	
		{
			for (int column = 1; column <=row ; column++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
