package practiceRepository;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) 
	{
		int a[]= {3,5,2,6,8,1,1,8,3};	
		System.out.println("Given Array : "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorted array : "+Arrays.toString(a));	
		System.out.print("Reversed array : ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
