package AAProgramsQS;

public class AEIsInteger2Digits 
{
	public static void main(String[] args) 
	{
		int n=-199;
		int digit=2;
		
		////////////////////////////////////
		if(n<0) {n=n*-1;}
		for (int i = 1; i < digit ; i++) 
		{
			n=n/10;
			System.out.println(n);
		}
		if(n>0 && n<=9) 
		{
			//System.out.println(n);
			System.out.println("its "+digit+" digit number");
		}
		else 
		{
			//System.out.println(n);
			System.out.println("its not "+digit+" digit number");
		}
	}
}
