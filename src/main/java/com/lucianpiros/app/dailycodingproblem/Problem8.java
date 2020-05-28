package com.lucianpiros.app.dailycodingproblem;

/**
  * A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:

   0
  / \
 1   0
    / \
   1   0
  / \
 1   1


**/


import com.lucianpiros.app.dailycodingproblem.util.TreeNode;
import com.lucianpiros.app.dailycodingproblem.util.Pair;

public class Problem8 {
	public int solve(TreeNode root) {

		Pair<Integer, Boolean> pair = helper(root);
	
		return pair.getFirst();	
	}

	private Pair<Integer, Boolean> helper(TreeNode root) {
		if (root == null) {
			return new Pair<>(0, true);
		}

		Pair<Integer, Boolean> left = helper(root.getLeft());
		Pair<Integer, Boolean> right = helper(root.getRight());

		boolean isUnival = true;

		if (Boolean.FALSE.equals(left.getSecond()) || Boolean.FALSE.equals(right.getSecond())) {
			isUnival = false;
		}
		if (root.getLeft() != null && root.getData() != root.getLeft().getData()) {
			isUnival = false;
		}
		if (root.getRight() != null && root.getData() != root.getRight().getData()) {
			isUnival = false;
		}

		if (isUnival) {
			return new Pair<>(left.getFirst() + right.getFirst() + 1, true);
		}
		else {
			return new Pair<>(left.getFirst() + right.getFirst(), false);
		}
	}
}
