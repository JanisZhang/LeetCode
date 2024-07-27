package com.easy.array;

import java.util.Arrays;

/**
 * @link：https://leetcode.com/problems/plus-one/submissions/1334814097/
 */
public class PlusOne {
//    public static int[] plusOne(int[] digits) {
//        int index = digits.length - 1;
//        int[] newDigits;
//        if (digits[index] == 9 && digits.length==1 ) {
//            return new int[]{0,1};
//        }
//        while (index >= 0) {
//            if(digits[index] < 9) {
//                digits[index]++;
//                return digits;
//            }
//            digits[index] = 0;
//            index--;
//            if(index == 0){
//                if(digits[index] != 9){
//                    digits[index] ++;
//                    return digits;
//                }else {
//                    digits[index] = 0;
//                    newDigits = new int[digits.length + 1];
//                    for(int i = 1; i < newDigits.length; i++){
//                        newDigits[i] = digits[i - 1];
//                    }
//                    newDigits[0] = 1;
//                    return newDigits;
//                }
//
//            }
//        }
//        return digits;
//    }


    public static void main(String[] args) {
        int[] digits = plusOne(new int[]{1,0,9,9,9});
        System.out.println(Arrays.toString(digits));
    }

    private static int[] plusOne(int[] digits) {
        int n = digits.length;
        //从数组末尾开始向前遍历
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] < 9) {
                digits[i]++;
                //没有进位，直接返回
                return digits;
            }
            //产生进位，需要将该位赋值为 0
            digits[i] = 0;
        }
        //整体产生了进位，数组长度需要变化加 1
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }
}
