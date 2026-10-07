package practiceRepository;

public class CountVowelsAndConsonants 
{

	public static void main(String[] args) 
	{
		String s="Automation";
		String snew=s.toLowerCase();
		int vowel=0,conso=0;
		
		System.out.println("GIven string is "+snew);
		StringBuilder sbvo=new StringBuilder();
		StringBuilder sbco=new StringBuilder();
		for(int i=0;i<=snew.length()-1;i++)
		{
			if(snew.charAt(i)=='a'||snew.charAt(i)=='e'||snew.charAt(i)=='i'||snew.charAt(i)=='o'||snew.charAt(i)=='u')
			{
				vowel++;
				sbvo.append(snew.charAt(i));
			}
			else
			{
				conso++;
				sbco.append(snew.charAt(i));
			}
		}
		System.out.println("vowels count : "+vowel+"\nvowels are : "+sbvo+" \nConsonants : "+conso+" \nConsonants are "+sbco);
		
	}

}
