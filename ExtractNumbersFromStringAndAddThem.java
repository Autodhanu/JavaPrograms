
public class ExtractNumbersFromStringAndAddThem {

	public static void main(String[] args) {
		
		String str="Selenium12345";
		
		int total=0;
		
		for(int i=0;i<str.length();i++)
		{
			char charValue = str.charAt(i);
			
			if(Character.isDigit(charValue))
			{
				total=total+Character.getNumericValue(charValue);
			}
		}
		System.out.println(total);		

	}

}
