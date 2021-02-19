package com.dailychallenges.numberofprimes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumberOfPrimesTest {
	@ParameterizedTest
	@CsvSource({"8,20","10,30","25,100","46,200","168,1000","0,-5","18,66","32,133","25,99"})
	public void test1(int expected, int actualParam) {
		assertEquals(expected, NumberOfPrimes.primeNumbers(actualParam));
	}
}
