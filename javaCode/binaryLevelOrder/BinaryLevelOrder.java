package javaCode.binaryLevelOrder;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import javaCode.balancedBinaryTree.TreeNode;

public class BinaryLevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<TreeNode>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> levelList = new ArrayList<>();

        if (root == null) { return ans; }

        TreeNode dummy = new TreeNode(1001);
        q.add(root);
        q.add(dummy);


        while (!q.isEmpty()) {
            TreeNode temp = q.poll();

            if (temp.val != 1001) {
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
                levelList.add(temp.val);
            }
            else {
                if (!q.isEmpty()) {
                    List<Integer> temparr = new ArrayList<Integer>();
                    for (int i = 0; i < levelList.size(); i++) {
                        temparr.add(levelList.get(i));
                    }
                    ans.add(temparr);
                }
            }
        }
        return ans; 
    }
}
