package ACProgramOnNumber;

public class A5isXPrimeNumber 
{
	/*
	static void printPrime(int n)
	{
		
		for (int i =1; i<n; i++) 
		{
			boolean isPrime=true;
			//check if number is prime
			for (int j=2; j<n; j++) 
			{
				if(n%j==0)
				{
					isPrime=false;
					break;
				}
				if(isPrime)
				{System.out.println(i);}	
			}
			if(isPrime)
			{System.out.println(i);}	
		}		
	}
	
	
	*/
		
		public static void isIntPrime()
		{
			int n=9;
			boolean isPrime = true;
			for (int i = 2; i <n; i++) 
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime) 
			{
				System.out.println("its a prime number");
			}
			else {System.out.println("not a prime number");}
		}
		
		public static void main(String[] args) {
			isIntPrime();
		}
}		
		

