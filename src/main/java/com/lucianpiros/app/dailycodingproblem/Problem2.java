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

	// Solve same problem without using division	
	public List<Integer> solve1(List<Integer> nums) {
		List<Integer> sol = new ArrayList<>();

		if (nums.size() <= 1) {
			for (int i = 0; i < nums.size(); ++i) {
				sol.add(0);
			}
		}
		else {
			for (int i = 0; i < nums.size(); ++i) {
				sol.add(1);
			}
			int prod = 1;
			for (int i = 1; i < nums.size(); ++i) {
				prod *= nums.get(i-1);
				sol.set(i, sol.get(i)  * prod);
			}
			prod = 1;
			for (int i = nums.size() - 2; i >= 0; --i) {
				prod *= nums.get(i+1);
				sol.set(i, sol.get(i) * prod);		
			}
		}
		return sol;
	}
}
