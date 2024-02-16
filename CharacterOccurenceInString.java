//package Logic;

public class CharacterOccurenceInString {

	public static void main(String[] args) {
		
		String str="I love you";

		getCharCount(str,'o');
	}
	
	public static void getCharCount(String strInput,char ch)
	{
		int count = 0;
		char[] charArray = strInput.toCharArray();
		
		for(char val:charArray)
		{
			if(val==ch)
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
