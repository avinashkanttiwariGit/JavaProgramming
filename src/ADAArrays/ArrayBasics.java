package ADAArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBasics {
	public static void main(String[] args) {
		// declare an array (int default value 0, string null)
		int[] ar1 = new int[5];
		// initialize an array index
		ar1[1] = 100;
		System.out.println(ar1[1]);

		// declare and initialize at same time
		int[] ar2 = { 600,200, 300, 400, 500 };
		//array sort to asc order
		Arrays.sort(ar2);
		System.out.println(ar2);
		//System.out.println(Arrays.toString());
		
		// Print all value or array
		System.out.println(Arrays.toString(ar2));
		// set a default value with array
		int[] ar3= new int[6];
		Arrays.fill(ar3,400);
		System.out.println(Arrays.toString(ar3));
		// compare two arrays-- length should be same, each element should be same
		System.out.println(Arrays.equals(ar3, ar2));
		
		
	}

}
