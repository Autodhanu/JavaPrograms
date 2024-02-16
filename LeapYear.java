
public class LeapYear {

	public static void main(String[] args) {
		
		int year=2012;
		
		boolean flag=false;
		
		if(year%4==0)
		{
			
			if(year%100==0)
			{
				if(year%400==0)
				{
					flag=true;
				}
				else
				{
					flag=false;
				}
			}
			else 
			{
				flag=true;
			}
						
		}
		else
		{
			flag=false;
		}
		
		if(flag)
		{
			System.out.println(year+ " is an leap year");
		}
		else
		{
			System.out.println(year+ " is not an leap year");
		}

	}

}
