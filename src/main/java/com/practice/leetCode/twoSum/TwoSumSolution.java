package com.practice.leetCode.twoSum;

/**
 *
 *   Question:
 *   Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 *   You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 *   Example:
 *   Given nums = [2, 7, 11, 15], target = 9,
 *
 *  Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 *
 * @author bruce.sun
 * @date 2018/6/6
 * @param
 * @return
 *
 */
public class TwoSumSolution {

    /**
     *   第一次解决方案
     *   O(N^2)的时间复杂度
     *
     * @author bruce.sun
     * @date 2018/6/6
     * @param
     * @return
     *
     */
    public int[] twoSum1(int[] nums,int target){
        int[] result=new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                //数组单个本身不进行累加
                if(i!=j){
                    if(target==nums[i]+nums[j]){
                        result[0]=i;
                        result[1]=j;
                    }
                }
            }
        }
        return result;
    }



}
