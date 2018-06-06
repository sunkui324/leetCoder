package com.practice.leetCode;


import com.practice.leetCode.twoSum.TwoSumSolution;
import org.junit.Assert;
import org.junit.Test;

public class TwoSumSolutionTest  {

    private static TwoSumSolution solution=new TwoSumSolution();

    @Test
    public void testSolution1(){
        int[] nums=new int[]{2,7,13,15};
        int target =9;
        int[] result=solution.twoSum1(nums,target);
        System.out.println(result[0]);
        System.out.println(result[1]);
        Assert.assertNotNull(result);
    }

    @Test
    public void testSolution2(){
        int[] nums=new int[]{2,7,13,15};
        int target =9;
        int[] result=solution.twoSum2(nums,target);
        System.out.println(result[0]);
        System.out.println(result[1]);
        Assert.assertNotNull(result);
    }

    @Test
    public void testSolution3(){
        int[] nums=new int[]{2,7,13,15};
        int target =9;
        int[] result=solution.twoSum3(nums,target);
        System.out.println(result[0]);
        System.out.println(result[1]);
        Assert.assertNotNull(result);
    }

    @Test
    public void testSolution4(){
        int[] nums=new int[]{2,7,13,15};
        int target =9;
        int[] result=solution.twoSum4(nums,target);
        System.out.println(result[0]);
        System.out.println(result[1]);
        Assert.assertNotNull(result);
    }

}
