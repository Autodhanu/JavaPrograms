
public class PalindromeNumber {

	public static void main(String[] args) {
		
		int number=121;
		
		int copy=number;
		
		int reverse=0;
		
		while(number!=0)
		{
			int reminder=number%10;
			
			reverse=(reverse*10)+reminder;
			
			number=number/10;
		}

		System.out.println("reverse number is:   "+reverse);
		
		if(copy==reverse)
		{
			System.out.println("Its an paliandrome");
		}
		else
		{
			System.out.println("Its not an paliandrome");
		}
	}

}
