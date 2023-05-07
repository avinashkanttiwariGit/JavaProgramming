package ADAArrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StudentTest 
{
	public static void main(String[] args) 
	{
		int[] marks= {56,75,84,36};
		Student student= new Student("Ranga",marks);
	// number of marks
		int numberOfMarks=marks.length;
		System.out.println(numberOfMarks);
	//sum of marks
		int sum = 0;
		for (int i : marks) 
		{
			sum=sum+i;
		}
		System.out.println("sum of all marks "+sum);
		
	// get max of marks
		int max=Integer.MIN_VALUE;
		for (int i : marks) 
		{
			if(i>max) max=i;
		}
		System.out.println("max marks= "+max);
		
	//get min of marks
		int min=Integer.MAX_VALUE;
		for (int i : marks) 
		{
			if(i<min) min=i;
		}
		System.out.println("min marks= "+min);
		
	//get average
		//BigDecimal avg=sum/marks.length;
		//System.out.println("avg marks= "+avg); //but int/int will not give correct decimal value
		//or
		BigDecimal avg = new BigDecimal(sum).divide(new BigDecimal(marks.length));				 
		System.out.println("avg marks= "+avg);// but when value is like 33.33333333... it will give error
		//
		avg = new BigDecimal(sum).divide(new BigDecimal(marks.length),3,RoundingMode.UP);				 
		System.out.println("avg marks= "+avg);// but when value is like 33.33333333... it will give error
		//
		
	}
}
