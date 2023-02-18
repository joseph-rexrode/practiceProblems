package javaCode.binaryLevelOrder;

import javaCode.balancedBinaryTree.TreeNode;

public class BinaryLevelOrderTest {
    public static void main(String[] args) {
        BinaryLevelOrder test = new BinaryLevelOrder();

        TreeNode testNode = new TreeNode(3,
                                    new TreeNode(9),
                                    new TreeNode(20, 
                                        new TreeNode(15), 
                                        new TreeNode(7)));
        
        System.out.println(test.levelOrder(testNode));
    }
}
