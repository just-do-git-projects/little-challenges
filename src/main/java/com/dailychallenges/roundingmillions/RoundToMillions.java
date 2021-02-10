package com.dailychallenges.roundingmillions;

import java.util.Arrays;

/** https://edabit.com/challenge/x2mxt5c6Qp4Nr5qDv */
public class RoundToMillions {
	private static final int MILLION = 1000000;
	
	public static Object[] millionsRounding(Object[] cities) {
		if (cities != null) {
			return Arrays.asList(cities).stream().map(e -> (Object[])e)
					.map(e -> new Object[] {e[0], round((int)e[1])}).toArray();
		}
		
		return new Object[] {};
	}
	
	private static int round(float millions) {
		return Math.round(millions / MILLION) * MILLION;
	}
}
