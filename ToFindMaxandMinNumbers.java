//package Logic;

public class ToFindMaxandMinNumbers {

	public static void main(String[] args) {
		
		
		int a[]= {25,78,6,4,100,9,0,54,88,2500};
		
		int max=a[0];
		int min=a[0];
		
		
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			if(min>a[i])
			{
				min=a[i];
			}
		}
		
		System.out.println("The maximum number in an array is "+max);
		System.out.println("The minimum number in an array is "+min);
		
		
	}

}
