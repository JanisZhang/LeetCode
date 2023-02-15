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

    public static List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return Collections.emptyList();
        }

        List<Integer> list = new ArrayList<Integer>();

        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }
}
