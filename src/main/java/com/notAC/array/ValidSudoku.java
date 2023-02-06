package com.notAC.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author JiaDi Zhang
 * @LeetCode: 36. Valid Sudoku
 * @Link:
 * https://leetcode.com/problems/valid-sudoku/?envType=study-plan&id=data-structure-i
 * @date 2023/2/6
 */
public class ValidSudoku {

    public static void main(String[] args) {
        System.out.println(0/3);
        System.out.println(0%3);
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9; i++){
            HashSet<Character> rows = new HashSet<Character>();
            HashSet<Character> columns = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            int RowIndex = 3*(i/3);
            int ColIndex = 3*(i%3);
            for (int j = 0; j < 9;j++){
                if(board[i][j]!='.' && !rows.add(board[i][j]))
                    return false;
                if(board[j][i]!='.' && !columns.add(board[j][i]))
                    return false;
                if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
                    return false;
            }
        }
        return true;
    }

/**For a block traversal, it goes the following way.
 *
 * 0,0, 0,1, 0,2; < --- 3 Horizontal Steps followed by 1 Vertical step to next level.
 *
 * 1,0, 1,1, 1,2; < --- 3 Horizontal Steps followed by 1 Vertical step to next level.
 *
 * 2,0, 2,1, 2,2; < --- 3 Horizontal Steps.
 *
 * And so on...
 * But, the j iterates from 0 to 9.
 *
 * But we need to stop after 3 horizontal steps, and go down 1 step vertical.
 *
 * Use % for horizontal traversal.
 * Because % increments by 1 for each j : 0%3 = 0 , 1%3 = 1, 2%3 = 2, and resets back.
 * So this covers horizontal traversal for each block by 3 steps.
 *
 * Use / for vertical traversal.
 * Because / increments by 1 after every 3 j: 0/3 = 0; 1/3 = 0; 2/3 =0; 3/3 = 1.
 *
 * So far, for a given block, you can traverse the whole block using just j.
 *
 * But because j is just 0 to 9, it will stay only first block. But to increment block, use i.
 *
 * To move horizontally to next block,
 * use % again : ColIndex = 3 * i%3 (Multiply by 3 so that the next block is after 3 columns.
 * Ie 0,0 is start of first block, second block is 0,3 (not 0,1);
 *
 * Similarly, to move to next block vertically, use / and multiply by 3 as explained above.
 * Hope this helps.
 * **/

}
