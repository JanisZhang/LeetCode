package com.easy.binarytree;

/**
 * @link:https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 */
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        traverse(root);
        return res;
    }

    private  void traverse(TreeNode root) {
        if (root == null){
            return;
        }

        depth ++;

        if (root.left == null & root.right == null) {
            res = Math.max(res,depth);
        }

        traverse(root.left);
        traverse(root.right);

        depth--;
    }

    int res = 0, depth = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        MaximumDepthofBinaryTree maximumDepthofBinaryTree =
                new MaximumDepthofBinaryTree();
        System.out.println(maximumDepthofBinaryTree.maxDepth(root));
    }


}
