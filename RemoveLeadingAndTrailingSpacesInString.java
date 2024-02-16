
public class RemoveLeadingAndTrailingSpacesInString {

	public static void main(String[] args) {
		
		String str =" hello agni ";
		
		//System.out.println(str.length());
		
		//String str1 = str.trim();
		
		//System.out.println(str1.length());
		
		String str2 = str.replaceAll("^[ \t]+|[ \t]+$", "");
		
		System.out.println(str2.length());
	}

}
