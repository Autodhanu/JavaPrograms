
public class PalindromeString {

	public static void main(String[] args) {
		
		String str="dad";
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}

		System.out.println(rev);
		
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("Its an palindrome string");
		}
		else
		{
			System.out.println("Its not an palindrome string");	
		}
	}

}
