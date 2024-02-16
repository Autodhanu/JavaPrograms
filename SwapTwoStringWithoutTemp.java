
public class SwapTwoStringWithoutTemp {

	public static void main(String[] args) {


		String a="Hello";
		
		String b="World";
		
		System.out.println("before swaping a is "+a);
		System.out.println("before swaping b is "+b);
		
		a=a+b;//helloworld
		
		b=a.substring(0, a.length()-b.length());//hello
		
		a=a.substring(b.length());//world
		
		System.out.println("after swaping a is "+a);
		System.out.println("after swaping b is "+b);
		

	}

}
