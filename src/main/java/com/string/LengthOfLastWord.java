package com.string;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        for(int i= s.length(); i>0; i--){
            char cur = s.charAt(i-1);
            if(' ' == cur){
                if(count != 0){
                   break;
                }
                continue;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
}
