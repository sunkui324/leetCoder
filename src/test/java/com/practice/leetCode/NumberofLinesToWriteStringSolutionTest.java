package com.practice.leetCode;

import com.practice.leetCode.q0806_NumberofLinesToWriteString.NumberofLinesToWriteStringSolution;
import org.junit.Assert;
import org.junit.Test;

public class NumberofLinesToWriteStringSolutionTest {

    @Test
    public void test(){
        int[] widths=new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String S = "abcdefghijklmnopqrstuvwxyz";
        NumberofLinesToWriteStringSolution numberofLinesToWriteStringSolution=new NumberofLinesToWriteStringSolution();
        //总长度
        int result =numberofLinesToWriteStringSolution.numberOfLines(widths,S);
        System.out.println("总长度:"+result);
        int lineLenght=result %100;
        int lineCount=result /100+1;
        Assert.assertEquals(60,lineLenght);
        Assert.assertEquals(3,lineCount);

    }
}
