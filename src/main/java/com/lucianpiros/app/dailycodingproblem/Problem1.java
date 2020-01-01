package com.lucianpiros.app.dailycodingproblem;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*/

import java.util.Set;
import java.util.HashSet;

public class Problem1 {
	
	public boolean solve(int[] numbers, int target) {
		Set<Integer> exists = new HashSet<>();	

		for (int num : numbers) {
			if (exists.contains(target - num)) { 
				return true;
			}
			exists.add(num);
		}
		return false;
	}
}
