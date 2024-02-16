
public class LengthOfStringWithoutLengthMethod {

	public static void main(String[] args) {


		String str="selenium";
		
		int len = str.length();
		
		System.out.println(len);
		
		int length=0;
		
		char[] charArray=str.toCharArray();
		
		for(char ch:charArray)
		{
			length++;
		}

		System.out.println(length);
	}

}
