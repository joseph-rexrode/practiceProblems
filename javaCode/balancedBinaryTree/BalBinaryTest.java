package javaCode.balancedBinaryTree;

public class BalBinaryTest {
    public static void main(String[] args) {
        BalBinary bal = new BalBinary();
        TreeNode test = new TreeNode(2, (new TreeNode(1)), 
                        new TreeNode(4, (new TreeNode(3)), 
                        new TreeNode(5, null, new TreeNode(6))));
        System.out.println(bal.isBalanced(test));
    }
}

