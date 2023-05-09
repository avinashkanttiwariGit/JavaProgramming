package ADArrays;

import java.util.Arrays;
import java.util.Iterator;

public class ArraySortAsc 
{
	//sort an array in ascending order
	//for desc change if (ar1[i]>ar1[j]) to if (ar1[i]<ar1[j])
	public static void main(String[] args) 
	{
		int[] ar1 = new int[] {44,67,43,75,24};
		
		int temp;
		for (int i=0; i<ar1.length;i++)
		{
			for (int j=i;j<ar1.length;j++) 
			{
				//compare first array value to all the other values
				// if any value is lesser than first value than swap
				// now again first array value is to be compared with next 
				// array values till end of array, ultimately first value will
				// be minimum
				
				//repeat for 2nd array value for ar[3]-ar[5] and so on.
				if (ar1[i]>ar1[j]) 
				{	
					temp=ar1[i];
					ar1[i]=ar1[j];
					ar1[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(ar1));  //24
		
	}
}
