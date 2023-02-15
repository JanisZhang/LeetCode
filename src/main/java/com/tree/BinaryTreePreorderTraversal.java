package com.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author JiaDi Zhang
 * @LeetCode: 144. Binary Tree Preorder Traversal
 * @Link:
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 * @date 2023/2/15
 */
public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.left.right = new TreeNode(5);
    }

    public static List<Integer> preorderTraversal1(TreeNode root) {
        if(root == null){
            return Collections.emptyList();
        }

        List<Integer> list = new ArrayList<Integer>();

        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        // Create a list to store the traversal result
        List<Integer> result = new ArrayList<>();

        // Call helper method to perform the traversal
        traversal(root, result);

        // Return the result
        return result;
    }

    // Helper method to perform the preorder traversal
    public static void traversal(TreeNode root, List<Integer> result) {
        // Return if the current node is null
        if(root == null) return;

        // Add the current node's value to the result list
        result.add(root.val);

        // Recursively traverse the left and right subtrees
        traversal(root.left, result);
        traversal(root.right, result);
    }
}
