package ACProgramOnNumber;

public class A8DisplayMultiplicationTable 

{
	
	public static void printTableOfN(int t)
	{
		for (int i = 1; i <11; i++) 
		{
			
			int tableValue = t*i;
			System.out.println(tableValue);
		}
	}
	public static void main(String[] args) 
	{
		printTableOfN(9);
	}
	
}
