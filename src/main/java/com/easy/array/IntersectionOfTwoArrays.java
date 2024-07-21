package com.easy.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JiaDi Zhang
 * @LeetCode: 350. Intersection of Two Arrays II
 * @Link:
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/?envType=study-plan&id=data-structure-i
 * @date 2023/2/4
 */
public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        System.out.println(intersect(nums1,nums2).length);
    }

    //my solution
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();

        for(int num : nums1) {
            list.add(num);
        }

        List<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < nums2.length; i++){
            Integer value = nums2[i];
            if(list.contains(value)){
                list.remove(value);
                result.add(value);
            }
        }

        int[] results = new int[result.size()];

        for(int i = 0; i < results.length; i++){
            results[i] = result.get(i);
        }

       return results;
    }
}
