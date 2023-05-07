package AAProgramsQS;

public class AABigestOf3Numbers 
{
	public static void main(String[] args) 
	{
		int a=11;
		int b=9;
		int c=6;
		
		int biggestNumber=0;
		if(a>b) 			{biggestNumber=a;}
		else 				{biggestNumber=b;}
		if(biggestNumber<c) {biggestNumber=c;}
		
		System.out.println(biggestNumber);
		
	}
	
}