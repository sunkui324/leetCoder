package com.practice.leetCode;

import com.practice.leetCode.q0657_JudgeRouteCircle.JudgeRouteCircleSolution;
import org.junit.Assert;
import org.junit.Test;

public class JudgeRouteCircleSolutionTest {

    private JudgeRouteCircleSolution judgeRouteCircleSolution= new JudgeRouteCircleSolution();

    @Test
    public void solution1(){
        boolean bool=judgeRouteCircleSolution.solution1("UD");
        Assert.assertTrue(bool);
    }


}
