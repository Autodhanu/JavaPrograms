
public class SumOfElementsInArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		
		int sum=0;
		
		/*
		 * for(int i=0;i<arr.length;i++) { sum=sum+arr[i]; }
		 */
		for(int a:arr)
		{
			sum=sum+a;
		}
		
		System.out.println("sum of array is  "+sum);

	}

}
