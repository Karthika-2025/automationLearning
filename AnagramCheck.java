package practiceRepository;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) 
	{
		String s1="wards";
		String s2="sdraw";
		System.out.println("String S1 : "+s1);
		System.out.println("String S2 : "+s2);
		char[] s1c=s1.toCharArray();
		char[] s2c=s2.toCharArray();
		Arrays.sort(s1c);
		Arrays.sort(s2c);
		if(Arrays.equals(s1c, s2c))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
}
