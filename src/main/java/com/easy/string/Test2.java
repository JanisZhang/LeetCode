package com.easy.string;

public class Test2 {
    public static void main(String[] args) {
        String s  = "1101";
        Test2 test2 = new Test2();
        System.out.println(test2.numSteps(s));

    }

    int step = 0;

    public int numSteps(String s) {
        int len = s.length();
        if(len > 0){
            if(s.charAt(len - 1) =='1'){
                /**
                 * 说明此时“个位”数字为1
                 * 需要减去1，变成偶数。
                 * 操作步数加1。
                 */
                step++;
            }

            /**
             * 上面减去1之后，此时字符串“个位为0”，偶数
             * 截取字符串，删除一个0 ----- 即在上面减1的基础上做除2的操作。
             */
            s = s.substring(0,len-1);

            if(!s.contains("1")) {
                /**
                 * 此时为“00000..000”的情况
                 * 可以return当前step了。
                 */
                return step;
            }

            /**
             * 说明此时不为“00000..000”的情况
             * 因为上面除以2。步数加1.
             */
            step++;

            /**
             * 递归从末尾拿掉一个0之后的字符串
             * 此时 s = s = s.substring(0,len-1);
             */
            numSteps(s);
        }

        return step;
    }
}
