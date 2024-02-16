
public class HowToVerifyStringContainsOnlyDigit {

	
	  public static boolean isEmpty(String str) {
	 
		  if(str==null || str.length()==0)
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
	  }
	 

	public static boolean isNumeric(String str) {

		if(isEmpty(str))
		{
			return false;
		}
		
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println(isNumeric("10"));
		System.out.println(isNumeric("adff"));
		System.out.println(isNumeric(null));
		System.out.println(isNumeric(""));
	}

}
