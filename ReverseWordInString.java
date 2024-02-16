
public class ReverseWordInString {

	public static void main(String[] args) {
		
		String str="I LOVE SELENIUM";
		
		String[] strArray = str.split(" ");
		
		System.out.println(strArray.length);
		
		String reverse="";
		
		for(int i=strArray.length-1;i>=0;i--)
		{
			reverse=reverse+strArray[i]+" ";
		}

		System.out.println(reverse);
	}

}
