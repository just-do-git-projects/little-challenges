package com.dailychallenges.howmuchtrue;

import java.util.ArrayList;
import java.util.List;

/** https://edabit.com/challenge/vKpGt4ufSKmEJ3Xjd
 * the joy of using lambdas 😳 */
public class HowMuchTrue {

	public static int countTrue(boolean[] arr) {
		List<Boolean> list = primitiveToObject(arr);
		
		return (int)list.stream().filter(e -> e == true).count();
	}
	
	private static List<Boolean> primitiveToObject(boolean[] arr) {
		List<Boolean> result = new ArrayList<>();
		
		for (boolean elem: arr) {
			result.add((Boolean)elem);
		}
		
		return result;
	}
}
