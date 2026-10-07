package practiceRepository;

import java.util.Scanner;

public class StringExercise 
{

	public static void main(String[] args) 
	{
		
			
		System.out.println("\nRemove white spaces\n-------------------------");
		String s2="H  el lo";
		System.out.println("Given string : "+s2);
		String splitarr[]=s2.split(" ");
		System.out.print("After removing white spaces the string is ");
		for(int i=0;i<splitarr.length;i++)
		{
			System.out.print(splitarr[i]);
		}
		System.out.println();
		
		System.out.println("\nCount Occurrences of a Character in a String\n-----------------------------------");
		String s3="Hello";
		int temp=0;
		System.out.println("Given string : "+s3);
		char chararr[]=new char[s3.length()];
		chararr=s3.toCharArray();
		System.out.println();
		for(int i=0;i<=chararr.length-1;i++)
		{
			temp=1;
			for(int j=i+1;j<=chararr.length-1;j++)
			{
				if(chararr[i]==chararr[j])
				{
					temp++;
					chararr[j]=' ';
				}
			}
			if(chararr[i]!=' ')
			{
				System.out.println(chararr[i]+" Count "+temp);
			}
		}
		
		System.out.println("\nCount of words in a string\n----------------------");
		String s4="I Love India And I love Tamil";
		System.out.println("Given string : "+s4);
		String strarr[]=s4.split(" ");
		System.out.println("Count of words : "+strarr.length);		
		System.out.println("Occurance of each word\n-------------------");
		int temp1=0;
		for(int i=0;i<=strarr.length-1;i++)
		{
			temp1=1;
			for(int j=i+1;j<=strarr.length-1;j++)
			{
				if(strarr[i].equalsIgnoreCase(strarr[j]))
				{
					temp1++;
					strarr[j]=" ";
				}
			}
			 if(strarr[i]!=" ")
			{
				System.out.println(strarr[i]+" Occured "+temp1);
			} 
		}
		System.out.println("After removing duplicate words\n--------------------------");
		for(int i=0;i<=strarr.length-1;i++)
		{
			if(strarr[i]!=" ")
			{
				System.out.print(strarr[i]+" ");
			}
		}
	}
}
