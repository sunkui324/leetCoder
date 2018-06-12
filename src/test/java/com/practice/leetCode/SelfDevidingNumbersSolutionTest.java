package com.practice.leetCode;

import com.practice.leetCode.q728_SelfDividingNumbers.SelfDevidingNumbersSolution;
import org.junit.Assert;
import org.junit.Test;


public class SelfDevidingNumbersSolutionTest {

    @Test
    public void test() {
        SelfDevidingNumbersSolution selfDevidingNumbersSolution = new SelfDevidingNumbersSolution();
        int size = selfDevidingNumbersSolution.solution(100, 130).size();
        Assert.assertEquals(7, size);
    }
}
