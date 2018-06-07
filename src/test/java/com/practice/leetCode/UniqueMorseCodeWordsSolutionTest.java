package com.practice.leetCode;

import com.practice.leetCode.q0804_uniqueMorseCodeWords.UniqueMorseCodeWordsSolution;
import org.junit.Assert;
import org.junit.Test;

public class UniqueMorseCodeWordsSolutionTest {

    @Test
    public void testSolution1(){
        UniqueMorseCodeWordsSolution uniqueMWS=new UniqueMorseCodeWordsSolution();
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        int result=uniqueMWS.solution1(words);
        Assert.assertEquals(2,result);

    }
}
