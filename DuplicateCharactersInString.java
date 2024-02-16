import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		
		printDuplicateCharacters("javamava");

	}
	
	public static void printDuplicateCharacters(String str)
	{
	    char[] charArray=str.toCharArray();
	    
	    HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
	    
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
	   // System.out.println(mp);
	    
	    Set<Character> keys = mp.keySet();
	    
	    for(char ch:keys)
	    {
	    	if(mp.get(ch)>1)
	    	{
	    		System.out.println(ch+ "  "+mp.get(ch));
	    	}
	    }
		
	}

}
