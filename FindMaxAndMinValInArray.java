
public class FindMaxAndMinValInArray {

	public static void main(String[] args) {
		
		int arr[]= {3,7,2,8,9,5};
		
        int min=arr[0];
        
        int max=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
        	if(arr[i]<min)
        	{
        		min=arr[i];
        	}
        	else if(arr[i]>max)
        	{
        		max=arr[i];
        	}
        }
    System.out.println("minimum number in an array is:  "+min);
    System.out.println("maximum number in an array is:  "+max);
	}

}
