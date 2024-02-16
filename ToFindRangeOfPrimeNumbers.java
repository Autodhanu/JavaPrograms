
public class ToFindRangeOfPrimeNumbers {

	public static void main(String[] args) {
		
				
		for(int k=2;k<=100;k++)
		{
			boolean flag=false;
			int no=k;
			
			for(int i=2;i<no;i++)
			{
				if(no%i==0)
				{
					flag=true;
				}
			}
			if(flag==false)
			{
				System.out.println("Its an Prime Number"+no);
			
		    }
		}
	}

}
