package javaCode.invertBinaryTree;
public class Test {
    public static void main(String[] args) {
        Invert invert = new Invert();
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), null);
        System.out.println(invert.invertTree(tree1));
    }
}
