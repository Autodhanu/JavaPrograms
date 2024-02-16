import java.util.Scanner;

public class CheckEvenOrOddNumber {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("please enter a number : ");
		
		Scanner sc= new Scanner(System.in);
		
		num=sc.nextInt();
		
		sc.close();
		
		if(num%2==0)
		{
			System.out.println("Entered number is even");
		}
		else
		{
			System.out.println("Entered number is odd");
		}

	}

}
