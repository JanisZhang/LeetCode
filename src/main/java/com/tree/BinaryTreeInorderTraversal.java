package com.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author JiaDi Zhang
 * @LeetCode: 94. Binary Tree Inorder Traversal
 * @Link:
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 * @date 2023/2/15
 */
public class BinaryTreeInorderTraversal {

    // left, node, right
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack  = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }


}
