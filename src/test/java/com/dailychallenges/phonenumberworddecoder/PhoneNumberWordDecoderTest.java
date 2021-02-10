package com.dailychallenges.phonenumberworddecoder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class PhoneNumberWordDecoderTest {
	
	@ParameterizedTest
	@CsvSource({"123-647-3937,123-647-EYES", "(325)444-8378,(325)444-TEST", "653-879-8447,653-TRY-THIS",
		"435-224-7613,435-224-7613", "(333)668-3245,(33D)ONT-FAIL", "(025)445-6741,(025)445-6741"})
	public void testDecodePhoneNumber(String expected, String actualParam) {
		assertEquals(expected, PhoneNumberWordDecoder.textToNum(actualParam));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"", "  13x"})
	public void testErrorDecodingPhoneNumber(String parameter) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> PhoneNumberWordDecoder.textToNum(parameter));
	}
	
	@Test
	public void testErrorDecodingPhoneNumber() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> PhoneNumberWordDecoder.textToNum(null));
	}
}
