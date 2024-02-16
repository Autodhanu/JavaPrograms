
public class PrintOddNumbers {

	public static void main(String[] args) {
		
		
		int givenInput=1234567890;
		
		String strValue = String.valueOf(givenInput);
		
		char[] charArray = strValue.toCharArray();

		for(char c:charArray)
		{
			int intVal = Character.getNumericValue(c);
			
			if(intVal%2!=0)
			{
				System.out.println(intVal);
			}
		}
	}

}
