package com.easy.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JiaDi Zhang
 * @LeetCode: 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/
 * https://leetcode.com/problems/merge-sorted-array/solutions/2120234/visual-explanation-o-1-space-java/
 * @date 2023/2/3
 */
public class MergeSortedArray {
    public static void merge(int[] A, int m, int[] B, int n) {
        for ( int i = m+n-1, a = m - 1, b = n - 1;b >= 0;i--) {
            if ((a >= 0) && (A[a] > B[b])) {
                A[i] = A[a--];
                continue;
            }
            A[i] = B[b--];
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int end = m+n-1;
        int rightMost1 = m-1;
        int rightMost2 = n-1;

        while (rightMost2>=0) {
            if (rightMost1 >= 0 && nums1[rightMost1] >= nums2[rightMost2]) {
                nums1[end] = nums1[rightMost1];
                end--;
                rightMost1--;
            } else {
                nums1[end] = nums2[rightMost2];
                end--;
                rightMost2--;
            }
        }
    }


    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m = 3,n=3;

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge2(nums1,m,nums2,n);
        for (int num:nums1){
            System.out.println(num);
        }
    }
}
