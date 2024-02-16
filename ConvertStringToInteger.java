
public class ConvertStringToInteger {

	public static void main(String[] args) {
		
		String strValue="12345";
		
		int intValue = Integer.parseInt(strValue);
		
		System.out.println("Integer value is "+intValue);
		
		int intValue1=Integer.valueOf(strValue);

		System.out.println("Integer value is "+intValue1);
	}

}
