package com.dailychallenges.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PersistenceTest {
	
	@ParameterizedTest
	@CsvSource({"0,5", "1,27", "2,58", "3,5789"})
	public void testAdditive(int expected, int actualParam) {
		assertEquals(expected, Persistence.additivePersistence(actualParam));
	}

	@ParameterizedTest
	@CsvSource({"0,7", "1,1234567890", "3,39", "6,6788", "11,277777788888899"})
	public void testMultiplicative(long expected, long actualParam) {
		assertEquals(expected, Persistence.multiplicativePersistence(actualParam));
	}
}
