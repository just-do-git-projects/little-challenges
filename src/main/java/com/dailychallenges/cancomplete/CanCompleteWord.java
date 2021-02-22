package com.dailychallenges.cancomplete;

public class CanCompleteWord {

	//https://edabit.com/challenge/t9S9nNr79pLqjXgqb
	public static boolean canComplete(String initial, String word) {
		String regex = String.join(".*", initial.split(""));
		return word.matches(regex);
	}
}
