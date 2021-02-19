package com.dailychallenges.sevenboom;

import java.util.Arrays;

/** https://edabit.com/challenge/CKqfEowjmSTw2jsso */
public class SevenBoom {
	public static String sevenBoom(int[] arr) {
		return Arrays.toString(arr).contains("7") ? "Boom!" 
				: "there is no 7 in the array";
	}
}
