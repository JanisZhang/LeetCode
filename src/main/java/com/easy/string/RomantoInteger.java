package com.easy.string;

import java.nio.charset.StandardCharsets;
import java.util.Random;

/**
 * @link https://leetcode.com/problems/roman-to-integer/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class RomantoInteger {
//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.

//    Input: s = "MCMXCIV"
//    Output: 1994
//    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

    public  int romanToInt(String s) {
        if (s.isEmpty()){
            return 0;
        }

        int i = 0;
        int result = 0;

        while (i < s.length()){
            switch (s.charAt(i)){
                case 'I':
                    if(i< s.length()-1) {
                        if (s.charAt(i + 1) == 'V') {
                            result += 4;
                            i++;
                            break;
                        }else if (s.charAt(i + 1) == 'X') {
                            result += 9;
                            i++;
                            break;
                        }
                    }
                    result += 1;
                    break;
                case 'V':
                   result+=5;
                    break;
                case 'X':
                    if(i< s.length()-1) {
                        if (s.charAt(i + 1) == 'L') {
                            result += 40;
                            i++;
                            break;
                        }else if (s.charAt(i + 1) == 'C') {
                            result += 90;
                            i++;
                            break;
                        }
                    }
                    result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if(i< s.length()-1){
                        if (s.charAt(i+1) == 'D') {
                            result += 400;
                            i++;
                            break;
                        }else if (s.charAt(i+1) == 'M') {
                            result += 900;
                            i++;
                            break;
                        }
                    }
                    result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }

            i++;
            if (i >= s.length()) {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RomantoInteger romantoInteger = new RomantoInteger();
        System.out.println(romantoInteger.romanToInt("LVIII"));
    }
}
