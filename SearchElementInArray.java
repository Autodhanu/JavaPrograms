import java.util.Arrays;

public class SearchElementInArray {

	public static void main(String[] args) {
		
		int [] a= {10,20,30,40,50,60,70,80,90,100};
		
		int key=10;
		
		int elementIndex = Arrays.binarySearch(a, key);
		int elementPosition = elementIndex+1;
		
		System.out.println("Array found at the index  "+elementIndex);
		System.out.println("Array found at the element position  "+elementPosition);
//if it writs negative number then element not present in the array
	}

}
