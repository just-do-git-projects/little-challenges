package com.dailychallenges.basicpiglatin;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/** https://edabit.com/challenge/2aajqTB69y7ZSSo9v */
public class BasicPigLatin {

	public static String pigLatin(String str) {
		return Stream.of(str.split(" ")).map(s -> isFirstVowel(s) ? addWay(s) : addAy(s))
				.map(s -> containsUpperCase(s) ? capitalize(s) : s).collect(Collectors.joining(" "));
	}

	private static boolean isFirstVowel(String s) {
		return s.matches("[aeiouAEIOU].*");
	}

	private static String addWay(String s) {
		return s.replaceAll("(\\w+)(\\p{Punct}?)", "$1" + "way" + "$2");
	}

	private static String addAy(String s) {
		return s.replaceAll("(\\w)(\\w+)(\\p{Punct}?)", "$2$1" + "ay" + "$3");
	}

	private static boolean containsUpperCase(String s) {
		return s.matches("\\w*\\p{Upper}\\w*\\p{Punct}?");
	}

	private static String capitalize(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	}

}
