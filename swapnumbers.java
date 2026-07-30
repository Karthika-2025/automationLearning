package practiceRepository;

public class swapnumbers {

	public static void main(String[] args)
	{
		int a=20 , b=30;
		int swap;
		
		System.out.println("Before swap : A - "+a+ " B - "+b);
		
		a=a+b; //50
		b=a-b; //20
		a=a-b;  //30
		
		/*
		swap=a;
		a=b;
		b=swap;
		*/
		System.out.println("After swap : A - "+a+ " B - "+b);
		
	}

}
