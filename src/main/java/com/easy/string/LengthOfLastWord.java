package com.easy.string;

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

    public static int lengthOfLastWord2(String s) {
        s = s.trim();
        return s.length()-s.lastIndexOf(" ")-1;
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy  ";
        System.out.println(s.trim());
    }
}
