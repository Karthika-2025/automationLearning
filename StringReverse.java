package practiceRepository;

public class StringReverse {

	public static void main(String[] args)
	{
		String s="Hello";
		System.out.println("Given string : "+s);
		System.out.print("Reversed string is : ");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
