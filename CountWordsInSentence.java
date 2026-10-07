package practiceRepository;

public class CountWordsInSentence {

	public static void main(String[] args) 
	{
		String s="I  love  selenium with Java".toLowerCase();
		String[] spl=s.split(" ");
		int count=0;
		System.out.println("Given word : "+s);
		for(int i=0;i<=spl.length-1;i++)
		{
			if(!spl[i].isBlank())
			{
				count++;
			}

		}
		System.out.println("count of words "+count);
	}

}
