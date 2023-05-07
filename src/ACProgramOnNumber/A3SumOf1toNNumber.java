package ACProgramOnNumber;

public class A3SumOf1toNNumber 
{
	
	static void findSum(int n)
	{
		int sum=0;
		for (int i = 0; i <=n; i++) 
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) 
	{
		findSum(10);
	}
}
