//package Logic;

public class VowelsCount {
	
	public static boolean isVowel(char t)
	{
		return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'|t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
		
	}

	public static void main(String[] args) {
		
		String str="aeiou";
		
		int vCount=0;
		
		for(int i=0;i<str.length();i++)
		{
			
			if(isVowel(str.charAt(i)))
			{
				vCount++;
				System.out.println(str.charAt(i));
			}
		}

		System.out.println(vCount);
		
	}

}
