package com.notAC.array;

/**
 * @author JiaDi Zhang
 * @LeetCode: 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/
 * https://leetcode.com/problems/merge-sorted-array/solutions/2120234/visual-explanation-o-1-space-java/
 * @date 2023/2/3
 */
public class Merge_Sorted_Array {
    public static void merge(int[] A, int m, int[] B, int n) {
        for ( int i = m+n-1, a = m - 1, b = n - 1;b >= 0;i--) {
            if ((a >= 0) && (A[a] > B[b])) {
                A[i] = A[a--];
                continue;
            }
            A[i] = B[b--];
        }
    }
}
