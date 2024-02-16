//package Logic;

public class EvenOddNumbersFrmArray {

	public static void main(String[] args) {
		
		int arr []= {1,3,2,4,7,8,9};
		
		System.out.println("Even number in array is .....");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
			
		}
		
		System.out.println("Odd number in array is .....");

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
