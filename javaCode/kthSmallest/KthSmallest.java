package javaCode.kthSmallest;

import javaCode.balancedBinaryTree.TreeNode;

public class KthSmallest {
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        // traverse tree in order and count while traversing

        if (root == null) { return -1; }

        int prev = kthSmallest(root.left, k);

        if (prev!= -1) {
            return prev;
        }

        count++;
        if (count == k) {
            return root.val;
        }

        int post = kthSmallest(root.right, k);
        if (post != -1) {
            return post;
        }

        return -1;

    }
}
