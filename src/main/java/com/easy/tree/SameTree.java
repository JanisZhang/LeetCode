package com.easy.tree;

import java.util.List;

/**
 * @link https://leetcode.com/problems/same-tree/
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        traverse(p,q);

        return isSame;
    }

    private void traverse(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return ;
        }

        if (p == null || q == null || p.val != q.val) {
          isSame = false;
          return;
        }

        traverse(p.left,q.left);
        traverse(p.right,q.right);
    }

    Boolean isSame = true;


    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
    }
}
