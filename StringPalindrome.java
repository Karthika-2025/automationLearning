package practiceRepository;

public class StringPalindrome 
{

	public static void main(String[] args) 
	{
		String s="Madam";
		String s2=new StringBuilder(s).reverse().toString();
		System.out.println(s);
		System.out.println(s2);
		if(s.equalsIgnoreCase(s2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
	}

}
