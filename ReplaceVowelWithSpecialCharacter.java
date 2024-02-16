
public class ReplaceVowelWithSpecialCharacter {

	public static void main(String[] args) {

		String str = "au yion muert";

		
		  char[] charArray = str.toCharArray();
		  
		  for(int i=0;i<str.length();i++) {
		  
		  if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') 
		  { 
			  charArray[i]='*'; 
			  
		  }
		  
		  }
		  
		  for(int i=0;i<str.length();i++) { System.out.print(charArray[i]);
		  
		  }
		 

		//String strReplacement = str.replaceAll("[AEIOUaeiou]", "*");
		//System.out.println(strReplacement);
	}

}
