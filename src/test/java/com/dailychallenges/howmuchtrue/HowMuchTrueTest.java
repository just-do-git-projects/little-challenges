package com.dailychallenges.howmuchtrue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class HowMuchTrueTest {
	@SuppressWarnings("preview")
	record Argument(int expected, boolean[] actualArgument) {}
	
	private static Stream<Arguments> provideExpectedResultAndActualArgument() {
		return Stream.of(
					Arguments.of(new Argument(2, new boolean[] { true, false, false, true, false })),
					Arguments.of(new Argument(0, new boolean[] { false, false, false, false })),
					Arguments.of(new Argument(0, new boolean[] {})),
					Arguments.of(new Argument(8, new boolean[] { false, false, true, true, false, false, false, true, true, true, true, false, true, true, false })),
					Arguments.of(new Argument(3, new boolean[] { true, false, true, true, false, false, false, false, false })),
					Arguments.of(new Argument(8, new boolean[] { false, true, true, false, true, true, false, true, false, true, false, true, false, true, false })),
					Arguments.of(new Argument(6, new boolean[] { true, false, true, true, true, false, true, true, false, false })),
					Arguments.of(new Argument(3, new boolean[] { false, false, false, false, true, false, true, false, true, false, false })),
					Arguments.of(new Argument(3, new boolean[] { true, false, false, false, true, false, false, true, false, false, false }))
				);
	}
	
    @ParameterizedTest
    @MethodSource("provideExpectedResultAndActualArgument")
    public void test1(Argument argument) {
        assertEquals(argument.expected, HowMuchTrue.countTrue(argument.actualArgument));
    }

}
