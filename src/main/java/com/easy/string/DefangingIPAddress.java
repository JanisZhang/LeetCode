package com.easy.string;

import java.util.regex.Pattern;

/**
 * @author JiaDi Zhang
 * @LeetCode: 1108. Defanging an IP Address
 * @Link:
 * <a href="https://leetcode.com/problems/defanging-an-ip-address/">...</a>
 * @date 2024/2/6
 */
public class DefangingIPAddress {

    public static String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer(7);
        for (String cur: address.split("\\.")){
            if(sb.length() != 0){
                sb.append("[.]");
            }
            sb.append(cur);
        }

        return sb.toString();
    }

    public static String defangIPaddr2(String address) {
        return String.join("[.]",address.split("\\."));
    }


    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }
}
