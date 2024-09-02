package com.easy.binarytree;

import java.util.HashMap;

/**
 * @link https://leetcode.com/problems/diameter-of-binary-tree/description/
 */
public class DiameterOfBTree {

    /**
     * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
     * This path may or may not pass through the root.
     *
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {
        travers(root);
        return maxDiameter;
    }

    int maxDiameter = 0;

    private void travers(TreeNode root) {
        if (root == null) {
            return ;
        }
        //对每个节点计算最大深度
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        int myDiameter = leftMax + rightMax;

        //更新全局最大直径
        maxDiameter = Math.max(myDiameter, maxDiameter);

        travers(root.left);
        travers(root.right);
    }

    //计算二叉树的最大深度
    int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        return 1 + Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        DiameterOfBTree diameterOfBTree = new
                DiameterOfBTree();
    }


}
