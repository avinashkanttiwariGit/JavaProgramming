package ACProgramOnNumber;

public class A6Print1toNPrimeNumber 
{
	public static void main(String[] args) 
	{		
		int n=10;
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
					System.out.println(j);
				}
				//else {System.out.println(j+" is not a prime number");
			}
	
		}	
	}
}
