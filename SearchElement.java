package practiceRepository;

import java.util.*;

public class SearchElement 
{

	public static void main(String[] args) 
	{
		int a[]= {0,20,30,40,20,60};
		Boolean find=false;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("ENter search element : ");
		int searchnum=input.nextInt();
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(searchnum==a[i])
			{
				find=true;
				System.out.println("Element found");
				break;
			}
		}
		if(find==false)
		{
			System.out.println("Not found");
		
		}
		
		
				
	}

}
