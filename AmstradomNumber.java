
public class AmstradomNumber {

	public static void main(String[] args) {
		
		int num=153;
		
		int copy=num;
		
		int sum=0;
		
		while(num!=0)
		{
			int reminder=num%10;
			sum=sum+(reminder*reminder*reminder);
			num=num/10;
			
		}
		
		if(copy==sum)
		{
			System.out.println("Its an amstradom number");
		}
       else
       {
	        System.out.println("Its not an amstradom number");
	   }
		
	}

}
