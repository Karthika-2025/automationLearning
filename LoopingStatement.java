package practiceRepository;

import java.util.*;

public class LoopingStatement {

	public static void main(String[] args) 
	{
		System.out.println("Number Programs");
		
		Scanner num=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=num.nextInt();
		int original=number;
		
		int remain, rev=0;
		while(number>0)
		{
			remain=number%10;
			rev=rev*10+remain;
			number=number/10;
		}
		
		System.out.println("1.Reversed number is "+rev);
		System.out.println("\n2.Palindrome or not \n*******************");
		
		if(original==rev)
		{
			System.out.println("Given is palindrome");
		}
		else
		{
			System.out.println("Given is not a palindrome");
		}
		
		System.out.println("\n3.Count of digits \n*******************");
		
		int digits=original;
		int re, i=0;
		int a[]=new int[10];
		
		do
		{
			re=digits%10;
			a[i]=re;
			i++;
			digits=digits/10;
		}
		while(digits>0);
		
		int countof=0;
		for(int j=0;j<=a.length-1;j++)
		{
			if(a[j]!=0)
			{
				countof++;
			}
		}
		System.out.println("Given no : "+original+"\nTotal Count is : "+countof);
		
		System.out.println("\n4.Count of odd & even digits \n****************************");
		int x=original;
		int remainder,oddcount=0,evencount=0;
		
		System.out.println("Given no : "+x);
		do
		{
			remainder=x%10;
			if(remainder%2==0)
			{
				evencount++;
			}
			if(remainder%2!=0)
			{
				oddcount++;
			}
			x=x/10;
		}while(x>0);
		System.out.println("Even count : "+evencount+ " Odd count : "+oddcount);
		
		System.out.println("\n5.Sum of digits of a given number \n********************************");
		int sum=original;
		int sumremain,sumofdigit=0;
		
		do
		{
			sumremain=sum%10;
			sumofdigit=sumofdigit+sumremain;	
			sum=sum/10;
		}while(sum>0);
		System.out.println("Given number is : "+original+" \nSum is : "+sumofdigit);
	}

}
