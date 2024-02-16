
public class ArraysLinearSearch {

	public static void main(String[] args) {
		
		int [] arr = {10,20,70,50,68};
		
		int search_Element=700;
		boolean flag = false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search_Element)
			{
				flag=true;
				
				System.out.println("Element-Array index position : "+i);
				System.out.println("Element position at : "+(i+1));
			}
			
		}
		
		if(flag==false)
		{
			System.out.println("Array element not found");
		}

	}

}
