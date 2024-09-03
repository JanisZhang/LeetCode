package com.easy.string;

public class Test {
    public static void main(String[] args) {
//        String s  = "111";
//        String s  = "101";
//        String s  = "1";
//        String s  = "10";
//        String s  = "00";
//        String s  = "1111101000";
//        String s  = "11";
        String s  = "011100";
        Test test = new Test();
        System.out.println(test.convert(s));

//        String s  = "011100";
//        Test test = new Test();
//        int res = test.convert(s);

//        /**
//         * 此时已经计算的res的步骤包含：如果果是奇数，减1，和需要除2的次数
//         * 最后一步，2除2，余1.
//         * 根据题目，1还需要减去1，才为0。
//         * 因此，增加一步，达成0。
//         */
//        res++;
//
//        System.out.println(res);
    }

    int step = 0;

//    public int convert(String s) {
//        if(s.length() > 1){
//            if(s.charAt(0) =='1'){
//                /**
//                 * 参考那个思路的图
//                 * 我理解这里的n也就是题目里的.一直除2多少次
//                 */
//                step += s.length()-1;
////                cur = cur + Math.pow(2,s.length()-1);
//            }
//            convert(s.substring(1));
//        }else if(s.charAt(0) == '1'){
////            cur += 1;
//            /**
//             * 题目：如果是奇数，先减1
//             * 所以最后一位为‘1‘的时候，证明当前是奇数。需要减1，因此这里步骤加1
//             */
//            step++;
//        }
//
//        return step;
//    }

//    double cur = 0;
//
//    public double convert2(String s) {
//        if(s.length() > 1){
//            if(s.charAt(0) =='1'){
//                cur = cur + Math.pow(2,s.length()-1);
//            }
//            convert2(s.substring(1));
//        }else if(s.charAt(0) == '1'){
//            cur += 1;
//        }
//
//        return cur;
//    }

    public int convert(String s) {
        if(s.length() > 1){
            if(s.charAt(0) =='1'){
                /**
                 * 参考那个思路的图
                 * 我理解这里的n也就是题目里的.一直除2多少次
                 */
                step += s.length()-1;
//                cur = cur + Math.pow(2,s.length()-1);
            }

            if(s.charAt(0) =='0'){
                /**
                 * 转换到中间为奇数的情况
                 */
                step += s.length()-1;
//                cur = cur + Math.pow(2,s.length()-1);
            }

            convert(s.substring(1));
        }else if(s.charAt(0) == '1'){
//            cur += 1;
            /**
             * 题目：如果是奇数，先减1
             * 所以最后一位为‘1‘的时候，证明当前是奇数。需要减1，因此这里步骤加1
             */
            step++;
        }

        return step;
    }
}
