package com.dailychallenges.phonenumberworddecoder;

import java.util.List;
import java.util.regex.Pattern;

/** https://edabit.com/challenge/8NZaLdJBkhZCgNBc7 */
public class PhoneNumberWordDecoder {
	private static final int KEYSHIFT = 2;
	
	private static final Pattern PHONE_1 = Pattern.compile("^[A-Z\\d]{3}-[A-Z\\d]{3}-[A-Z\\d]{4}$");
	private static final Pattern PHONE_2 = Pattern.compile("^[(][A-Z\\d]{3}[)][A-Z\\d]{3}-[A-Z\\d]{4}$");
	private static final List<String> keypad = List.of("[A-C]","[D-F]","[G-I]","[J-L]","[M-O]","[P-S]","[T-V]","[W-Z]");
	
	public static String textToNum(String phone) {
		String newPhone = matches(phone);
		
		for (String key: keypad) {
			newPhone = newPhone.replaceAll(key, String.valueOf(keypad.indexOf(key) + KEYSHIFT));
		}

		return newPhone;
	}
	
	private static String matches(String phone) {
		if (phone != null && (PHONE_1.matcher(phone).matches() || PHONE_2.matcher(phone).matches())) {
			return phone;
		}
		
		String message = "The phone format must be XXX-XXX-XXXX or (XXX)XXX-XXXX.";
		throw new IllegalArgumentException(message);
	}	
}
