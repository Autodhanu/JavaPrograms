//package Logic;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		
		findDuplicateWords("hey java is java best language is java");

	}
	
	public static  void findDuplicateWords(String inputWords) {
		
		String[] splitWords = inputWords.split(" ");
		
		HashMap<String,Integer> mp=new HashMap<String,Integer>();
		
		for(String word:splitWords)
		{
			if(mp.containsKey(word))
			{
				
				mp.put(word, mp.get(word)+1);
			}
			else
			{
				mp.put(word, 1);
			}
		}
		
		//System.out.println(mp);
		
		Set<String> keysWodrs = mp.keySet();
		
		for(String word:keysWodrs)
		{
			if(mp.get(word)>1)
			{
				System.out.println(word+ "  " +mp.get(word));
			}
		}
	}

}
