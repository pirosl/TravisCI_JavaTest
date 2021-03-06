package com.lucianpiros.app.dailycodingproblem;

/**
 * Unit tests for Problem2 
 */

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestProblem2 {
	@Test
	public void Test1() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		assertEquals(Arrays.asList(120, 60, 40, 30, 24), new Problem2().solve(list));
	}

	@Test
	public void Test11() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		assertEquals(Arrays.asList(120, 60, 40, 30, 24), new Problem2().solve1(list));
	}

	@Test
	public void Test2() {
		List<Integer> list = Arrays.asList(3,2,1);
		assertEquals(Arrays.asList(2, 3, 6), new Problem2().solve(list));
	}

	@Test
	public void Test21() {
		List<Integer> list = Arrays.asList(3,2,1);
		assertEquals(Arrays.asList(2, 3, 6), new Problem2().solve1(list));
	}	

	@Test
	public void Test3() {
		List<Integer> list = Arrays.asList(1,1,1);
		assertEquals(Arrays.asList(1,1,1), new Problem2().solve(list));
	}

	@Test
	public void Test31() {
		List<Integer> list = Arrays.asList(2);
		assertEquals(Arrays.asList(0), new Problem2().solve1(list));
	}
}
