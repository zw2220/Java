package edu.java.chap4;

public class BalancedTree {
	public static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	public static int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}

	public static boolean isBalanced(TreeNode root) {
		return (maxDepth(root) - minDepth(root) <= 1);
	}
}

class TreeNode {
	TreeNode root = null;
	TreeNode right = null;
	TreeNode left = null;
}
