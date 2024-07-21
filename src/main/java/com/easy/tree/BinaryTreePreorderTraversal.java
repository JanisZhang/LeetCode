package com.easy.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

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

        System.out.println(traversalIterative(node).size());
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

    /**
     * The reason why the right child is pushed to the stack before the left child is that
     * we want to process the left subtree before the right subtree (since this is a pre-order traversal).
     * Pushing the right child before the left child ensures that
     * the left child will be processed first when it is popped from the stack.
     */
    public static List<Integer> traversalIterative(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> list = new ArrayList<>();

        // create a stack to store the node as we traverse the tree
        Stack<TreeNode> stack = new Stack<>();
        // push the root node onto the stack
        stack.push(root);

        // while the stack is not empty,
        while(!stack.isEmpty()){
            // pop the top node of the stack
            TreeNode curNode = stack.pop();
            list.add(curNode.val);

            if(curNode.right != null) {
                stack.push(curNode.right);
            }

            if(curNode.left != null) {
                stack.push(curNode.left);
            }
        }
        return list;
    }
}
