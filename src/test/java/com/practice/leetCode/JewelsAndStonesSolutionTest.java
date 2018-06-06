package com.practice.leetCode;

import com.practice.leetCode.q0771_jewelsAndStones.JewelsAndStonesSolution;
import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesSolutionTest {

    private static JewelsAndStonesSolution solution=new JewelsAndStonesSolution();
    @Test
    public void testSolution1(){

        int result=solution.jewelsAndStones1("aA","abAcAzzzz");
        Assert.assertEquals(result,3);
    }

    @Test
    public void testSolution2(){
        int result=solution.jewelsAndStones2("aA","abAcAzzzz");
        Assert.assertEquals(result,3);
    }


    @Test
    public void testSolution3(){
        int result=solution.jewelsAndStones3("aA","aAAzzzz");
        Assert.assertEquals(result,3);
    }

    @Test
    public void testSolution4(){
        int result=solution.jewelsAndStones3("aA","aAAzzzz");
        Assert.assertEquals(result,3);
    }
}
