package ADArrayAndArrayList;

import java.util.Arrays;
import java.util.Iterator;

public class AASumOfMarks {
	public static void main(String[] args) {
		int[] ar = { 19, 55,12, 77, 58 };
		System.out.println(Arrays.toString(ar));
		int size = ar.length;
		int sum = 0;

		/*
		 * for (int marks : ar) { sum = sum + marks; } System.out.println(sum);
		 */

		
		
		for (int i = 0; i < size; i++)
		{

			sum = sum + ar[i] ;
		}
		System.out.println(sum);
		
		
		
		String []stAr=new String[5];
		System.out.println(stAr[1]);
	}
}
