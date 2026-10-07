package practiceRepository;

import java.util.Arrays;

public class RemoveDupChars {

	public static void main(String[] args) 
	{
		/*
		String s="Automation".toLowerCase();
		System.out.println("Given String-> "+s);
		String res="";
		char[] ch=s.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.println(s.indexOf(ch[i]));
			for(int j=i+1;j<=ch.length-1;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=' ';
				}
			}
			res=res+ch[i];
			
		}
		System.out.println("After removing dups , the String -> "+res);
		
		*/
		
		String str = "programming";
		System.out.println("Given string "+str);
		String result = "";

		for(char c : str.toCharArray()) {
		    if(result.indexOf(c) == -1)
		        result += c;
		}

		System.out.println(result);
	}

}
