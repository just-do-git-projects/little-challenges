package com.dailychallenges.fuelup;

/** https://edabit.com/challenge/4PGHC3nqN9gH2svby */
public class LetsFuelUp {
	
	public static double determineFuelAmount(double distance) throws IllegalArgumentException {
		if (!isPositive(distance)) {
			throw new IllegalArgumentException(String.format("The distance must be greater than 0.0, but is %d", distance));
		}
		
		return Math.max(100.0, distance  * 10);
	}
	
	private static boolean isPositive(double distance) {
		return Double.compare(0.0, distance) < 0;
	}
}
