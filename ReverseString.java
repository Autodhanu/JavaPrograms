//package Logic;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String str= "abcd";
		
		char[] charArray = str.toCharArray();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}
		
		
	}

}
