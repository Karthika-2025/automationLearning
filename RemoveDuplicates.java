package practiceRepository;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		int a[]= {3,5,2,6,8,1,1,8,3};
		System.out.println("Given array is "+Arrays.toString(a));
		int i,j;
		for(i=0;i<=a.length-1;i++)
		{
			for(j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
				}
			}			
		}
		System.out.println("\nAfter removing duplicates given array is : ");	
		for(int k=0;k<=a.length-1;k++)
		{
			if(a[k]!=0)
			{
				System.out.print(a[k]+" ");
			}
		} 
	}

}
