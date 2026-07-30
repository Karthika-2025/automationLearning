package practiceRepository;

import java.util.*;

public class Ifelsepgms 
{
	public static void main(String[] args)
	{
		int a=20 , b=60;
		
		System.out.println("Given numbers : \nA - "+a+"\nB - "+b);
		if(a>b)
		{
			System.out.println("Larger number : "+a);
		}
		else
		{
			System.out.println("Larger number : "+b);
		}
		if(a<b)
		{
			System.out.println("Smaller number : "+a);
		}
		else
		{
			System.out.println("Smaller number : "+b);
		}
		
		Scanner day=new Scanner(System.in);
		
		System.out.println("Enter weekday : ");
		String s=day.next();
		
		switch (s)
		{
			case "Monday":
			System.out.println("Week no : 2");
			break;
			
			case "Sunday":
			System.out.println("Week no : 1");
			break;

			case "Tuesday":
				System.out.println("Week no : 3");
				break;
				
			case "Wednesday":
				System.out.println("Week no : 4");
				break;
				
			case "Thursday":
				System.out.println("Week no : 5");
				break;

			case "Friday":
				System.out.println("Week no : 6");
				break;
				
			case "Saturday":
				System.out.println("Week no : 7");
				break;

			default:
				System.out.println("Enter valid Day");
			
		}
		
	}
}
