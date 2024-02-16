import java.util.Arrays;
import java.util.Collections;

public class ArraySortUsingInbuildFn {

	public static void main(String[] args) {
		
		int [] arr= {40,20,30,10,20};
		
		String arrString =  Arrays.toString(arr);
		System.out.println("Arrays Before Swaping  : "+arrString);
		
		//sort in assending order using parllel sort methood
		
		 Arrays.parallelSort(arr);
		 
		 String arrString2 = Arrays.toString(arr);

		 System.out.println("Arrays After Swaping  : "+arrString2);
		 
		// ****************************Approach 2****************
		 
		String strArray3 = Arrays.toString(arr);
		System.out.println("Arrays Before Swaping  : "+strArray3);
		
		Arrays.sort(arr);
		
		String strArray4 =Arrays.toString(arr);
		System.out.println("Arrays After Swaping  : "+strArray4);
		
		
		// ****************************Approach 3****************
		Integer [] arr1 = {40,20,30,10,20};
		String strArray5 = Arrays.toString(arr1);
		System.out.println("Arrays Before Swaping  : "+strArray5);
		
		Arrays.sort(arr1, Collections.reverseOrder());
		
		String strArray6 =Arrays.toString(arr1);
		System.out.println("Arrays After Swaping  : "+strArray6);
	}

}
