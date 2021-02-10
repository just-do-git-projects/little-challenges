package com.dailychallenges.fuelup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class LetsFuelUpTest {
	
	
	@ParameterizedTest
	@CsvSource({"15,150", "23.5,235", "3,100"})
	public void testCalculateFuelWithPositiveValues(double key, double expectedValue) {
		double fuelAmount = LetsFuelUp.determineFuelAmount(key);
		Assertions.assertTrue(expectedValue == fuelAmount);
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {0.0, -10.0})
	public void testCalculateFuelWithNegativeValuesOrZero(double value) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> LetsFuelUp.determineFuelAmount(value));
	}
	
}
	