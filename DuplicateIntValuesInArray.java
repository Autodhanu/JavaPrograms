import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateIntValuesInArray {

	public static void main(String[] args) {
		
		int arr[]= {4,5,5,5,4,6,9,4};
		
		System.out.println("Array values :"+Arrays.toString(arr));
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			int k=0;
			
			if(!al.contains(arr[i]))
			{
				al.add(arr[i]);
				k++;
						
			   for(int j=i+1;j<arr.length;j++)
			   {
				  if(arr[i]==arr[j])
				  {
					k++;
												
			      }
				
			    }
			    System.out.println(arr[i]);
			    System.out.println(k+"   times occuring");
			
			
			    if(k==1)
			    {
			
				    System.out.println(arr[i]+"is unique number");
			    }
			
		     }
			
	     }
			
			
   }

}


