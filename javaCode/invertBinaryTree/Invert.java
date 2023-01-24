package javaCode.invertBinaryTree;
class Invert {
    // use recursion
    public TreeNode invertTree(TreeNode root) {
        TreeNode inverted = new TreeNode(root.val, root.left, root.right);
        
        // neither subtree exists
        if (root.right == null && root.left == null) {
            return inverted;
        }

        if (root.right != null) {
            // both exist?
            if (root.left != null) {
                inverted.left = invertTree(root.right);
                inverted.right = invertTree(root.left);
            }
            // just right exists
            else {
                inverted.left = invertTree(root.right);
                inverted.right = null;
            }
        }

        // just left exists
        else if (root.left != null && root.right == null) {
            inverted.right = invertTree(root.left);
            inverted.left = null;
        }

        return inverted;
    }
}