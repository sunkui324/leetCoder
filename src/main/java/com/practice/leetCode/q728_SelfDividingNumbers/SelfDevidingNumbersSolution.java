package com.practice.leetCode.q728_SelfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Question:
 * A self-dividing number is a number that is divisible by every digit it contains.
 * <p>
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * <p>
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * <p>
 * Given a lower and upper number bound,
 * output a list of every possible self dividing number,
 * including the bounds if possible.
 * <p>
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * <p>
 * Note:
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 *
 * @author bruce.sun
 * @date 2018/6/12
 */
public class SelfDevidingNumbersSolution {

    public List<Integer> solution(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (validateDate(i)) {
                result.add(i);
            }

        }
        return result;
    }


    private boolean validateDate(int i) {
        int m = i;
        while (i > 0) {
            int d= i%10;
            // 循环次数.
            i = i/10;
            if(d==0 ||(m%d)!=0){ return false;}
        }
        return true;
    }


}
