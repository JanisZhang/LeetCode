package com.easy.tree;

/**
 * @link https://leetcode.com/problems/symmetric-tree/description/
 */
public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isMirror(root.left,root.right);
    }


    private static Boolean isMirror(TreeNode node1,TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        return node1.val == node2.val
                && isMirror(node1.left,node2.right)
                && isMirror(node1.right,node2.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        System.out.println(isSymmetric(root));

    }
}
