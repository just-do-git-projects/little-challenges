package com.dailychallenges.roundingmillions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class RoundingToMillionsTest {

	@SuppressWarnings("preview")
	record Argument(Object[] expected, Object[] paramActual){}

	
	static Stream<Arguments> objectArrayProvider() {
		return Stream.of(
				Arguments.of(
						new Argument(new Object[] {new Object[] {"Tokyo", 37000000}, new Object[] {"Delhi", 29000000}, new Object[] {"Shanghai", 26000000}},
											new Object[] {new Object[] {"Tokyo", 37435191}, new Object[] {"Delhi", 29399141}, new Object[] {"Shanghai", 26317104}})
						),
				Arguments.of(
						new Argument(new Object[] {new Object[] {"Sao Paulo", 22000000}}, 
											new Object[] {new Object[] {"Sao Paulo", 21846507}})
						),
				Arguments.of(
						new Argument(new Object[] {}, new Object[] {})
						),
				Arguments.of(
						new Argument(new Object[] {new Object[] {"Macau", 1000000}, new Object[] {"Hong Kong", 8000000}, new Object[] {"Beijing", 20000000}},
														new Object[] {new Object[] {"Macau", 654743}, new Object[] {"Hong Kong", 7530053}, new Object[] {"Beijing", 20462610}})
						),
				Arguments.of(
						new Argument(new Object[] {}, null)
						)
				
			);
	}
	
	@ParameterizedTest
	@MethodSource("objectArrayProvider")
	public void testRoundMillionsForCities(Argument argument) { 
		assertArrayEquals(argument.expected, RoundToMillions.millionsRounding(argument.paramActual));
	}
}
