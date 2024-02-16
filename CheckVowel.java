
public class CheckVowel {

	public static void main(String[] args) {
		
		String str = "aiytghuorr";
		
		char[] charArray = str.toCharArray();
		
		for(char ch:charArray) {
			
			/*
			 * if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u') {
			 * System.out.println(ch+" is the vowel"); } else {
			 * System.out.println(ch+" is the constant"); }
			 */
			
			switch(ch) {
			  case 'a':
			  case 'e':	
			  case 'i':
			  case 'o':
			  case 'u':
				 System.out.println(ch+" is the vowel");
				 break;
			  default:
				 System.out.println(ch+" is the constant");
			}
		}

	}

}
