package com.dailychallenges.wordnests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class WordNestsTest {
	private static Stream<Arguments> invalid() {
		return Stream.of(
					Arguments.of("redeem", "rederedredrredredrerrrederedeememedeemedeemedeeemeemmedeemeemeemem"),
					Arguments.of("sensation", "sensatissenssensastssenensensasenssensensensationsationsationationtionsationatioionantionensationon"),
					Arguments.of("feed", "feefeeded"),
					Arguments.of("diet", "deit"),
					Arguments.of("broadcast", "broadcbroadcastbroadcastast")
				);
	}
	
	private static Stream<Arguments> valid() {
		return Stream.of(
					Arguments.of("survey", "sursursurvsurvssurssursusurveyrveyveyurveyveyurveyeyeyveyvey"),
					Arguments.of("station", "ststatstasstatistationontationtionionation"),
					Arguments.of("current", "currccurrcurcurrcucucurrentrrentrrententrententurrentent"),
					Arguments.of("diet", "diet"),
					Arguments.of("undermine", "undermiundermundermiunununderundermineminederminedermineneinene")
				);
	}
	
	
	
	@ParameterizedTest
	@MethodSource("invalid")
	public void testInvalid(String word, String nest) {
		assertFalse(WordNests.validWordNest(word,nest));
	}

	@ParameterizedTest
	@MethodSource("valid")
	public void testValid(String word, String nest) {
		assertTrue(WordNests.validWordNest(word,nest));
	}

}