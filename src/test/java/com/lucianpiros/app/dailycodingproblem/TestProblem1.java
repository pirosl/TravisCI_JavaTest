package com.lucianpiros.app.dailycodingproblem;

/**
 * Unit tests for Problem1 
 */

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestProblem1 {
	@Test
	public void Test1() {
		int[] nums = {1,2,2,3,8,1}; 
		assertTrue(new Problem1().solve(nums,4));
	}

	@Test
	public void Test2() {
		int[] nums = {1,2,4,5};
		assertFalse(new Problem1().solve(nums, 4));
	}

	@Test
	public void Test3() {
		int nums[] = {8,5,3,1};
		assertTrue(new Problem1().solve(nums, 6));
	}

	@Test
	public void Test4() {
		int[] nums = {};
		assertFalse(new Problem1().solve(nums, 2));
	}

	@Test
	public void Test5() {
		int[] nums = {-1, 4,3,1};
		assertTrue(new Problem1().solve(nums, 0));
	}
}
