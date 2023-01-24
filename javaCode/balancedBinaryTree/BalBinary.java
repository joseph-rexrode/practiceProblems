package javaCode.balancedBinaryTree;

public class BalBinary {
    public boolean isBalanced(TreeNode root) {
        return (subHeight(root) == -1) ? false: true;
    }
    
    int subHeight(TreeNode node) {
        // if node doesn't exist return 0
        if (node == null) { return 0; }
            
        int leftNode = subHeight(node.left);
        // if left node is unbalanced --> return -1 all the way
        if (leftNode == -1) { return -1; }
    
        int rightNode = subHeight(node.right);
        // if right node unbalanced --> return -1 all the way
        if (rightNode == -1) { return -1; }
    
        // getting here means both nodes are balanced
        // now check difference in height of nodes
        // if greater than one, this node is unbalanced
        if (Math.abs(leftNode - rightNode) > 1) { return -1; }
    
        // getting here means all nodes still balanced
        // so return the max height of the left and right nodes
        // add one because moving up one in the tree
        return Math.max(leftNode, rightNode) + 1;
    }
}
