package ACProgramOnNumber;

public class A9PrintTables 
{
	public static void printTable1ToN(int n)
	{
		for (int t = 1; t <= n; t++) 
		{
			for (int i = 1; i <11; i++) 
			{
				
				int tableValue = t*i;
				System.out.print(t+"*"+i+"="+tableValue+"\t");
				
			}
			
			System.out.println("");
		}
	}
		
	public static void main(String[] args) 
	{
		printTable1ToN(5);
	}
}
