package practiceRepository;

public class CountDupChars {

	public static void main(String[] args) 
	{
		String s="Automation".toLowerCase();
		System.out.println("GIven string "+s);
		//char c=s.charAt(0);
		int dup=0;
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<=s.length()-1;i++)
		{
			for(int j=i+1;j<=s.length()-1;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					dup++;
					sb.append(s.charAt(j));
				}
			}	
		}
		System.out.println("Count "+dup+"\nduplicate chars are "+sb);
	}

}
