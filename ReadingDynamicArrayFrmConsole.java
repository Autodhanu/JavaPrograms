//package Logic;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingDynamicArrayFrmConsole {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);

		System.out.println("Enter number of elements : ");
		
		int n = s.nextInt();
		
		int[] arr= new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element "+(i+1)+ ":");
			arr[i]=s.nextInt();
		}
		s.close();
		
		String str = Arrays.toString(arr);
		System.out.println("Array is"+str);
	}

}
