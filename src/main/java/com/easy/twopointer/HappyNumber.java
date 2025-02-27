package com.easy.twopointer;

/**
 * @link: https://leetcode.com/problems/happy-number/description/
 */
public class HappyNumber {

    public boolean isHappy(int n){
        int slowRunner = n;
        int fastRunner = getNext(n);

        while ( slowRunner != fastRunner) {
            slowRunner  = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }

        return slowRunner == 1;
    }

    private int getNext(int n) {
        int sumOfSqures = 0;
        while (n > 0){
            int digit = n %10;
            sumOfSqures += digit * digit;
            n/=10;
        }

        return sumOfSqures;
    }


}
