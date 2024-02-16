
public class ReverseWordsInString {

	public static void main(String[] args) {

		
		/*  String str = "Welcome to java";
		  
		  String[] strArray = str.split(" "); 
		  
		  String reverseString="";
		  
		  for(String strWord:strArray) 
		  { 
			  String reverseWord=""; 
			  
			  for(int i=strWord.length()-1;i>=0;i--)
			  { 
		          reverseWord=reverseWord+strWord.charAt(i); 
		      } 
			  
			  reverseString=reverseString+ reverseWord +" "; 
			  
		  } 
		  
		  System.out.println(reverseString);*/
		 

	
	  String str = "i love selenium";
	  
		/*
		 * StringBuffer str1=new StringBuffer(str); StringBuffer str2= str1.reverse();
		 * String str3 = str2.toString();
		 */
		
	  String[] strArray = str.split(" ");
	  
	  String reverseString = "";
	 // String reverseString1 = "";
	  
	  for (String strWord : strArray) 
	  {
		  String reverseWord = "";
	  
	      for (int i = strWord.length()-1; i>=0; i--) 
	      { 
	    	  reverseWord =reverseWord+strWord.charAt(i);
	      
	      }
	      reverseString=reverseString+reverseWord+" ";
	  }
	  System.out.println(reverseString);
	
	  
	}
}