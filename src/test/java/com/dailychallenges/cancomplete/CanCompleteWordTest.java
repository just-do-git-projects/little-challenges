package com.dailychallenges.cancomplete;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CanCompleteWordTest {
	
	@ParameterizedTest
	@CsvSource({"butl,beautiful", "sg,something", "sing,something"})
	public void testCanComplete(String initial, String word) {
		assertTrue(CanCompleteWord.canComplete(initial, word));
	}
	
	@ParameterizedTest
	@CsvSource({"butlz,beautiful","tulb,beautiful", "bbutl,beautiful", "sgi,something","siing,something"})
	public void testCantComplete(String initial, String word) {
		assertFalse(CanCompleteWord.canComplete(initial, word));
	}
}
