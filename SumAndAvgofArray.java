package practiceRepository;

import java.util.Arrays;

public class SumAndAvgofArray {

	public static void main(String[] args) 
	{
		int a[]= {3,5,2,6,8,1,1,8,3};

		System.out.println("Given array is "+Arrays.toString(a));
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array elements is "+sum);
		System.out.println("Avg of array is "+(sum/(a.length)));
	}

}
