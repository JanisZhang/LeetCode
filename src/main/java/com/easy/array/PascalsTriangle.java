package com.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author JiaDi Zhang
 * @LeetCode: 118. Pascal's Triangle
 * @Link:
 * https://leetcode.com/problems/pascals-triangle/?envType=study-plan&id=data-structure-i
 * @date 2023/2/5
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Integer[] arr1 = new Integer[1];
        arr1[0] = 1;
        result.add(Arrays.asList(arr1));
        if (numRows == 1) {
            return result;
        }
        Integer[] arr2 = new Integer[2];
        arr2[0] = 1;
        arr2[1] = 1;
        result.add(Arrays.asList(arr2));

        if (numRows == 2) {
            return result;
        }

        for (int i = 3; i <= numRows; i++) {
            Integer[] arr = new Integer[i];
            arr[0] = 1;
            arr[i - 1] = 1;
            for (int j = 1; j < i - 1; j++) {
                arr[j] = result.get(i - 2).get(j) + result.get(i - 2).get(j - 1);
            }
            result.add(Arrays.asList(arr));
        }
        return result;    }
}
