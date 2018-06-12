package com.practice.leetCode.q0461_HammingDistance;

/**
 * Question:
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 *
 * Given two integers x and y, calculate the Hamming distance.
 * Example 1:
 * Input: x = 1, y = 4
 *
 * Output: 2
 *
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 * @author bruce.sun
 * @date 2018/6/9
 *
 */
public class HammingDistanceSolution {

    public int solution1(int x,int y){
        // set different bits to 1, same bits to 0
        return Integer.bitCount(x^y);
    }
}
