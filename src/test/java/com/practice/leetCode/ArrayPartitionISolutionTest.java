package com.practice.leetCode;

import com.practice.leetCode.q0561_ArrayPartitionI.ArrayPartitionISolution;
import org.junit.Assert;
import org.junit.Test;

public class ArrayPartitionISolutionTest {

    @Test
    public void test(){
        int[] nums=new int[] {1,2,3,4};
        ArrayPartitionISolution arrayPartitionISolution=new ArrayPartitionISolution();
        int result=arrayPartitionISolution.arrayPairSum(nums);
        Assert.assertEquals(4,result);
    }
}
