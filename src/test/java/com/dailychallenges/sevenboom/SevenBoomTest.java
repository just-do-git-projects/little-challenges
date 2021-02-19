package com.dailychallenges.sevenboom;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SevenBoomTest {
	
	private static Stream<Arguments> arraySourceBoom() {
		return Stream.of(
				Arguments.of(new int[]{2, 6, 7, 9, 3}),
				Arguments.of(new int[]{76, 55, 44, 32}),
				Arguments.of(new int[]{35, 4, 9, 37})
			);				
	}
	
	private static Stream<Arguments> arraySourceNoBoom() {
		return Stream.of(
				Arguments.of(new int[]{33, 68, 400, 5}),
				Arguments.of(new int[]{86, 48, 100, 66})
				);
	}
	
	
	@ParameterizedTest
	@MethodSource("arraySourceBoom")
	public void testBoom(int[] actualParam) {
		assertEquals("Boom!", SevenBoom.sevenBoom(actualParam));
	}
	
	@ParameterizedTest
	@MethodSource("arraySourceNoBoom")
    public void testNoBoom(int[] actualParam) {
	    assertEquals("there is no 7 in the array", SevenBoom.sevenBoom(actualParam));
	}
}
