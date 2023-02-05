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

    public static int[][] sampleSolution(int[][] mat, int r, int c) {
        int matRow = mat.length;
        int matCol = mat[0].length;
        //If the reshape operation with given parameters is illegal,
        // output the original matrix.
        if ((r * c) != matRow * matCol) {
            return mat;
        }
        int[][] results = new int[r][c];
        int output_row = 0;
        int output_col = 0;
        for(int i = 0; i < matRow; i++){
            for(int j = 0; j < matCol; j++){
                results[output_row][output_col] = mat[i][j];
                output_col++;
                //if the cols value reached then we start from next row.
                if (output_col == c) {
                    output_col = 0;
                    output_row++;
                }
            }
        }
        return results;
    }
}
