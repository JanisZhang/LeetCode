package com.array;

/**
 * @author JiaDi Zhang
 * @LeetCode: 74. Search a 2D Matrix
 * @Link:
 * https://leetcode.com/problems/search-a-2d-matrix/?envType=study-plan&id=data-structure-i
 * @date 2023/2/6
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIndex = matrix.length - 1;
        int colIndex = matrix[0].length - 1;
        for (int i = 0; i <= rowIndex; i++ ) {
            if (target <= matrix[i][colIndex]) {
                for (int j = 0; j <= colIndex ; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
