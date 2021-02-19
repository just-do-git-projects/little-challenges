package com.dailychallenges.numberofprimes;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/** https://edabit.com/challenge/z8vvSdWjAPu5ufBuR */
public class NumberOfPrimes {
	public static int primeNumbers(int num) {
		List<Integer> listOfNumbers = IntStream.rangeClosed(2, num).boxed().collect(Collectors.toList());
		
		for (int i=2; i<num; i++) {
			final int n = i;
			List<Integer> nonPrimeNumbers = listOfNumbers.stream().filter(v -> v%n == 0 && v!=n).collect(Collectors.toList());
			listOfNumbers.removeAll(nonPrimeNumbers);
		}
		
		return listOfNumbers.size();
	}
}
