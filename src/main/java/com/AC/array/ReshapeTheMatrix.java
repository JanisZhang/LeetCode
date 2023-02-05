package com.AC.array;

/**
 * @author JiaDi Zhang
 * @LeetCode: 566. Reshape the Matrix
 * @Link:
 * https://leetcode.com/problems/reshape-the-matrix/?envType=study-plan&id=data-structure-i
 * @date 2023/2/5
 */
public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = new int[2][2];
        mat[0][0] = 1;
        mat[0][1] = 2;
        mat[1][0] = 3;
        mat[1][1] = 4;
        System.out.println(matrixReshape(mat,2,4)[0][2]);
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int curRow = mat.length, curColumns = mat[0].length;
        int numberOfIntegers = curRow * curColumns;
        int k = 0;
        //same as original arr
        if (curRow == r && curColumns == c) {
           return mat;
        }
        //If the reshape operation with given parameters is illegal,
        // output the original matrix.
        if ((r * c) != numberOfIntegers) {
            return mat;
        }
        int[] newArr = new int[numberOfIntegers];
        for (int i = 0; i < curRow; i++) {
            for(int j = 0; j < curColumns; j++) {
                newArr[k++] = mat[i][j];
            }
        }
        k = 0;
        int[][] results = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                results[i][j] = newArr[k++];
            }
        }
        return results;
    }
}
