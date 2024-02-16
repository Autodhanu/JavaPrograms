import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("please enter factorial number : ");
		
		int factLength = sc.nextInt();
		
		int factNum=1;
		
		for(int i=1;i<=factLength;i++)
		{
			factNum=factNum*i;
		}
		
		System.out.println(factNum);
		
		

	}

}
