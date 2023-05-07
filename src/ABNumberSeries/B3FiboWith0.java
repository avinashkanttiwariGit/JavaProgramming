package ABNumberSeries;

public class B3FiboWith0 
{
	public static void printFibonacci1toN(int n)
	{
		int a=0;
		int b=1;
		int fiboValue=0;
		
		while(a<n) 
		{
			System.out.println(a);	//0	1	1	2	3		
			fiboValue=a+b;			//1	2	3	5
			a=b;					//1	1	2	3
			b=fiboValue;			//1	2	3	5
		}
		
	}
	
	public static void main(String[] args) 
	{
		printFibonacci1toN(100);
	}
}
