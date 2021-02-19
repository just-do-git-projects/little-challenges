package com.dailychallenges.basicpiglatin;

import java.util.stream.Stream;

/** https://edabit.com/challenge/2aajqTB69y7ZSSo9v */
public class BasicPigLatin {
	
	public static String pigLatin(String str) {
		String interpunction = str.substring(str.length()-1);
		String sentence = Stream.of(str.replace(interpunction,"").split(" "))
				.map(w -> modify(w)).reduce("", (w1,w2) -> w1+w2+" ").trim();
		
		return sentence + interpunction;
	}
	
	private static String modify(String str) {
		boolean uppercase = Character.isUpperCase(str.charAt(0));
		String word = str.toLowerCase();
		
		word = word.substring(0,1).matches("[aeiou]") ? word + "way" :
				word.substring(1) + word.charAt(0) + "ay";
		
		return !uppercase ? word :
			word.substring(0,1).toUpperCase() + word.substring(1);
	}
}
