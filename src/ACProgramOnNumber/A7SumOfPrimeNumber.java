package ACProgramOnNumber;

public class A7SumOfPrimeNumber 
{
	
	public static void sumOfPrime(int n)
	{
		
		int sum=0;
		for (int j = 1; j<n ;j++) 
		{
			{
				boolean isPrime = true;
				for (int i = 2; i <=j/2; i++) 
				{		//5%
					if(j%i==0)
					{
						isPrime=false;
						break;
					}
				}
				if(isPrime) 
				{
					//System.out.println(j);
					sum=sum+j;
				}
				//else {System.out.println(j+" is not a prime number");
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		sumOfPrime(10);
	}
}
