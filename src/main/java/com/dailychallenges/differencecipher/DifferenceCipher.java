package com.dailychallenges.differencecipher;

/** https://edabit.com/challenge/KZrmicjc8zCZyGNee */
public class DifferenceCipher {
	
	public static int[] encrypt(String str) {
		if (str == null) {
			throw new IllegalArgumentException("Please, specify the String parameter.");
		}
		
		int[] result = new int[str.length()];
		for (int i=0; i<str.length(); i++) {
			result[i] = (i==0) ? str.charAt(i) : str.charAt(i)-str.charAt(i-1);
		}
		
		return result;
	}

	public static String decrypt(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Please, specify the array of integers parameter.");
		}

		char[] result = new char[arr.length];
		for (int i=0; i<arr.length; i++) {
			result[i] = (char) ((i==0) ? arr[i] : result[i-1] + arr[i]);
		}
		
		return String.valueOf(result);
	}
}
