package practiceRepository;

import java.util.Arrays;
import java.util.Iterator;

public class DuplicatesArray 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,1,3,2,4,5,5};
		
		System.out.println("Find duplicates");
		System.out.println("---------------");
		System.out.println("Given array : "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorted array : "+Arrays.toString(a));
		
		System.out.println("Duplicates");
		int count=0;
		int dup[]=new int[a.length];
		
		for (int i = 0; i < a.length; i++) 
		{			
				for (int j = i+1; j < a.length; j++) 
				{
					if(a[i]==a[j])
					{
						count++;
						dup[j]=a[j];
					}
				}
		}
		System.out.println("No of dup : "+count);
		System.out.println("Dup are ");
		for (int i = 0; i < dup.length; i++) 
		{
			if(dup[i]!=0)
			{
				System.out.println(dup[i]);
			}
		}
		System.out.println("\nCount of each duplicate");		
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			temp=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					temp++;
					a[j]=0;
				}
			}
			if(a[i]!=0)
			{
				System.out.println(a[i]+" times : "+temp);
			}
		}
	}	
}
