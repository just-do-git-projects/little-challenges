package com.dailychallenges.persistence;

import java.util.stream.Stream;

/** https://edabit.com/challenge/fKZ6m9rDHDvgp6aeu */
public class Persistence {
	private static int persistence = 0;
	
	public static int additivePersistence(int n) {
		persistence = 0;

		return (n < 10) ? persistence : add(n);
	}

	public static long multiplicativePersistence(long n) {
		persistence = 0;
		
		return (n < 10) ? persistence : multiply(n);
	}
	
	private static int add(int n) {
		persistence++;
		
		int result =  Stream.of(String.valueOf(n).split(""))
				.map(c -> Integer.parseInt(c)).reduce(0, (a,b) -> a+b);
		
		return result > 9 ? add(result) : persistence;
	}
	
	private static long multiply(long n) {
		persistence++;
		
		long result =  Stream.of(String.valueOf(n).split(""))
				.map(c -> Long.parseLong(c)).reduce(1L, (a,b) -> a*b);
		
		return result > 9 ? multiply(result) : persistence;
	}
}
