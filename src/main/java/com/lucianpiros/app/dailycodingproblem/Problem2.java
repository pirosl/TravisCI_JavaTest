package com.lucianpiros.app.dailycodingproblem;

/**
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
*/

import java.util.List;
import java.util.ArrayList;

public class Problem2 {
	public List<Integer> solve(List<Integer> nums) {
		List<Integer> sol = new ArrayList<>();
		Long prod = 1L;
		for (Integer n : nums) {
			prod *= n;
		}

		for (Integer n : nums) {
			sol.add((int)(prod / n));
		}
		
		return sol;	
	}
}
