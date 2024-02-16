//package Logic;

import java.util.HashMap;
import java.util.Set;

public class HowManyTimesEachCharacterOccurenceInString {

	public static void main(String[] args) {
		
		String str="I love you";

		eachCharOccurence(str);
	}
	
	public static void eachCharOccurence(String inputString)
	{
		
		String strNew = inputString.replace(" ", "");
		
		System.out.println(strNew);
		
	    char []	charArray=strNew.toCharArray();
		
		HashMap<Character,Integer> mp= new HashMap<Character,Integer>();
		
		for(char ch:charArray)
		{
			if(mp.containsKey(ch))
			{
				mp.put(ch, mp.get(ch)+1);
			}
			else
			{
				mp.put(ch, 1);
			}
			
		}
		
		//System.out.println(mp);
	    Set<Character> keys = mp.keySet();
	    
	    for(Character ch:keys)
	    {
	    	if(mp.get(ch)>1)
	    	{
	    		System.out.println(ch+ "  "+mp.get(ch));
	    	}
	    }
		
	}

}
