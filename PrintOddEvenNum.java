package practiceRepository;

import java.util.Arrays;

public class PrintOddEvenNum {

	public static void main(String[] args) 
	{
		int a[]= {3,5,2,6,8,1,1,8,3};
		System.out.println("Given array is "+Arrays.toString(a));
		System.out.println("\nPrint odd and even nos from array\n-----------------------------------");
		
		int odd[]=new int[a.length];
		int even[]=new int[a.length];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				even[i]=a[i];
			}
			else 
			if(a[i]%2!=0)
			{
				odd[i]=a[i];
			}
		}
		
		System.out.println("Odd nos : ");
		for(int i=0;i<=odd.length-1;i++)
		{
			if(odd[i]!=0)
			{
				System.out.print(odd[i]+" ");

			}
		}
		System.out.println("\nEven nos : ");
		for(int i=0;i<=even.length-1;i++)
		{
			if(even[i]!=0)
			{
				System.out.print(even[i]+" ");
			}
		}
	}

}
