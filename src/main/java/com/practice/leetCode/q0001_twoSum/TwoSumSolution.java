package com.practice.leetCode.q0001_twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Question:
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 *
 * @param
 * @author bruce.sun
 * @date 2018/6/6
 * @return
 */
public class TwoSumSolution {

    /**
     * 第一次解决方案
     * O(N^2)的时间复杂度
     *
     * @param
     * @return
     * @author bruce.sun
     * @date 2018/6/6
     */
    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                //数组单个本身不进行累加
                if (i != j) {
                    if (target == nums[i] + nums[j]) {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }
        return result;
    }

    /**
     * 第二次修改暴力解决方案
     *
     * @param
     * @return
     * @author bruce.sun
     * @date 2018/6/6
     */
    public int[] twoSum2(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No Two Sum Solution .");
    }

    /**
     * 使用hashmap中间存储,空间换时间
     * 两个循环 时间复杂度 O(n) 空间复杂度O(n)
     * hashmap中如果数值重复,会覆盖前面的
     * @param
     * @return
     * @author bruce.sun
     * @date 2018/6/6
     */
    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();

        //第一步,数据填充到map里面.
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        //第二步,循环nums ,并在map里面匹配
        for (int i = 0; i < nums.length; i++) {
            int nextNum = target - nums[i];
            //存在另外一个值,并且不是自己本身
            if (map.containsKey(nextNum) && map.get(nextNum) != i) {
                return new int[]{i, map.get(nextNum)};
            }
        }
        throw new IllegalArgumentException("No Two Sum Solution");

    }

    /**
     *   Hashmap 单循环
     *   时间复杂度O(n) 空间复杂度O(n)
     *
     * @author bruce.sun
     * @date 2018/6/6
     * @param
     * @return
     *
     */
    public int[] twoSum4(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int nextNum = target - nums[i];
            if (map.containsKey(nextNum) && map.get(nextNum) != i) {
                return new int[]{i, map.get(nextNum)};
            }

            map.put(nums[i], i);

        }
        throw new IllegalArgumentException("No Two Sum Solution");
    }


}
