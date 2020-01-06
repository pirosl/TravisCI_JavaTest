package com.lucianpiros.app.dailycodingproblem;

/**
 * Unit tests for Problem8 
 */

import com.lucianpiros.app.dailycodingproblem.util.TreeNode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestProblem8 {
	@Test
	public void Test1() {
		// Generate the following tree
		//    0
     		//   / \
       		//  1   0
          	//     / \
         	//    1   0
        	//   / \
       		//  1   1
		TreeNode root = new TreeNode(0);
		root.setLeft(new TreeNode(1));
		root.setRight(new TreeNode(0));
		root.getRight().setLeft(new TreeNode(1));
		root.getRight().setRight(new TreeNode(0));
		root.getRight().getLeft().setLeft(new TreeNode(1));
		root.getRight().getLeft().setRight(new TreeNode(1));

		assertEquals(new Problem8().solve(root), 5);
	}
}
