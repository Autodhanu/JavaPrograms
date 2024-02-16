
public class ConvertIntegerToString {

	public static void main(String[] args) {
		

		int integerValue=10;
		
		String strValue = Integer.toString(integerValue);
		
		System.out.println("String value is "+strValue);
		
		
		String strValue2 = String.valueOf(integerValue);
		
		System.out.println("String value is "+strValue2);
		
		
		String strValue3=String.format("%d", integerValue);
		
		System.out.println("String value is "+strValue3);
	}

}
