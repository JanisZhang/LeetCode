package com.easy.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/binary-tree-preorder-traversal/description/
 *
 * 返回前序遍历结果
 */
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {

        traverse(root);

        return list;
    }

    private void traverse(TreeNode root) {

        if (root == null) {
            return;
        }

        list.add(root.val);

        traverse(root.left);
        traverse(root.right);
    }

    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        BinaryTreePreorderTraversal binaryTreePreorderTraversal =
                new BinaryTreePreorderTraversal();

        for (int i:binaryTreePreorderTraversal.preorderTraversal(root)){
            System.out.println(i);
        }
    }
}
