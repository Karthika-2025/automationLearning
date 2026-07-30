package practiceRepository;

import java.util.Arrays;

public class FindLargeAndSmallNumber 
{

	public static void main(String[] args) 
	{
		int a[]= {3,5,2,6,8,1,1,8,3};
		System.out.println("Given array is "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sort : "+Arrays.toString(a));
		System.out.println("Largest number : "+a[a.length-1]);
		System.out.print("Smallest number : ");
		for(int k=0;k<=a.length-1;k++)
		{
			if(a[k]!=0)
			{
				System.out.print(a[k]);
				break;
			}
		}	
	}
}
