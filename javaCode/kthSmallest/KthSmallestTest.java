package javaCode.kthSmallest;

import javaCode.balancedBinaryTree.TreeNode;

public class KthSmallestTest {
    public static void main(String[] args) {
        KthSmallest test = new KthSmallest();

        TreeNode testNode = new TreeNode(3, 
                                new TreeNode(1, null, new TreeNode(2)), 
                                new TreeNode(4));
        int testK = 1;

        System.out.println(test.kthSmallest(testNode, testK));
    }
}
