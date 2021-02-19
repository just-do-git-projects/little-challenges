package com.dailychallenges.wordnests;

/** https://edabit.com/challenge/qRRYmmyTRBhJJNMwq */
public class WordNests {
	
	public static boolean validWordNest(String word, String nest) {
		String regex = "^(?:(?!"+word+").)+"+word+"(?!.*"+word+").+$";
		
		while(nest.matches(regex)) 
		{
			nest = nest.replace(word, "");
		}
		
		return word.equals(nest);
	}
}
