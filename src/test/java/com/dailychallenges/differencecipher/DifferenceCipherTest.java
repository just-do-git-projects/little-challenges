package com.dailychallenges.differencecipher;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class DifferenceCipherTest {
	
	@SuppressWarnings("preview")
	record Argument(int[] cipher, String text) {}

	static Stream<Arguments> provideCipherAndText(){
		return Stream.of(
					Arguments.of(new Argument(new int[]{63}, "?")),
					Arguments.of(new Argument(new int[]{73,43,-77,76,-83,65,-65,83,-14,-2,15,-13,15,-83},  "It's a secret!")),
					Arguments.of(new Argument(new int[]{83,34,-7,5,-11,1,5,-9}, "Sunshine")),
					Arguments.of(new Argument(new int[]{84,20,-3,-69,78,-9,4,-2,1,-6,13,6,-3,1,-83,65,17,-13,-69,83,1,-2,-17,13,-7,-2,-55,0}, "The neighbours are strange..")),
					Arguments.of(new Argument(new int[]{79,-4}, "OK")),
					Arguments.of(new Argument(new int[]{84,27,-2,2,3,0,-3,8,-75,-12,19,-19,80,-3,-77,73,5,-78,84,-12,-3,-69,71,-6,17,-14,1,9,-64}, "Tomorrow, 3 pm in the garden.")),
					Arguments.of(new Argument(new int[]{73,26,5,-72,76,-3,-4,-3,3,-69,68,5,-6,5,-58}, "Ich liebe dich.")),
					Arguments.of(new Argument(new int[]{83,16,5,7,-4,4,-7,13,-7,-10}, "Schokohund"))
				);
	}
	
	@ParameterizedTest
	@MethodSource("provideCipherAndText")
	public void testEncrypt(Argument argument) {
		Assertions.assertArrayEquals(DifferenceCipher.encrypt(argument.text), argument.cipher);     
	}
		
	@ParameterizedTest
	@MethodSource("provideCipherAndText")
	public void testDecrypt(Argument argument) {
	    assertEquals(argument.text, DifferenceCipher.decrypt(argument.cipher));
	}
}
