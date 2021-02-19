package com.dailychallenges.basicpiglatin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BasicPigLatinTest {
	
	@ParameterizedTest
	@CsvSource({"'Atscay areway reatgay etspay.','Cats are great pets.'",
		"'Omtay otgay away mallsay iecepay ofway iepay.','Tom got a small piece of pie.'",
		"'Ehay oldtay usway away eryvay excitingway aletay.','He told us a very exciting tale.'",
		"'Away iamondday isway otnay enoughway.','A diamond is not enough.'",
		"'Urryhay!', 'Hurry!'"
		})
	public void test1(String expected, String actualParam) {
		assertEquals(expected, BasicPigLatin.pigLatin(actualParam));
	}

}
