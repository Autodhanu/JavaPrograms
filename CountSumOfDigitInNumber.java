
public class CountSumOfDigitInNumber {

	public static void main(String[] args) {
		
		int number=3456;
		
		int sum=0;
		int count=0;
		
		while(number>0)
		{
			int reminder=number%10;
			
			//sum=sum+reminder;
			if(reminder%2==0)
			{
				count++;
				System.out.println("even number "+reminder);
				
			}
			
			number=number/10;
		}
		
		//System.out.println(sum);
		System.out.println("count of even number "+count);
	}

}
