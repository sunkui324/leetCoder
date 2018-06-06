package com.practice.leetCode.jewelsAndStones;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Question:
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 * <p>
 * The letters in J are guaranteed distinct, and all characters in J and S are letters.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <p>
 * Example 1:
 * Input: J = "aA", S = "aAAbbbb" Output: 3
 * <p>
 * Example 2:
 * Input: J = "z", S = "ZZ" Output: 0
 *
 * @author bruce.sun
 * @date 2018/6/6
 */
public class JewelsAndStonesSolution {


    /**
     * 第一个解决方案 hashMap
     * 判断手上的石头有多少是宝石 HashMap 加循环
     *
     * @param
     * @return
     * @author bruce.sun
     * @date 2018/6/6
     */
    public int jewelsAndStones1(String j, String s) {

        char[] jewelsChar = j.toCharArray();

        Map<Character, Character> checkJewelsMap = new HashMap();
        for (int i = 0; i < jewelsChar.length; i++) {
            checkJewelsMap.put(jewelsChar[i], jewelsChar[i]);
        }

        char[] stonesChar = s.toCharArray();
        int result = 0;
        for (int i = 0; i < stonesChar.length; i++) {
            if (checkJewelsMap.containsKey(stonesChar[i])) {
                System.out.println(stonesChar[i]);
                result++;
            }
        }

        return result;
    }


    /**
     * 第二个解决方案 用Set替换hashMap ,因为只用到了HashMap的key,判断是否存在. 不去取值
     * 使用for 对象循环,替换 下表的循环
     * 判断手上的石头有多少是宝石
     *
     * @param
     * @return
     * @author bruce.sun
     * @date 2018/6/6
     */
    public int jewelsAndStones2(String j, String s) {
        int result = 0;
        if (j.length() == 0 || s.length() == 0) {
            return result;
        }
        Set checkJewelsSet = new HashSet();
        for (char jewels : j.toCharArray()) {
            checkJewelsSet.add(jewels);
        }
        for (char jewels : s.toCharArray()) {
            if (checkJewelsSet.contains(jewels)) {
                System.out.println(jewels);
                result++;
            }
        }

        return result;
    }

    /**
     * 第三种解决方案:
     * 使用replace 的正则替换,根据替换次数判断有多少个宝石
     * replace 与 replaceALL 都是全局替换 不同的是replace是要求替换的是字符串,replaceALL要求替换的是正则表达式.
     * replaceFirst 与replaceALL基本类似 只替换第一个匹配项
     * <p>
     * [^aA] 负值操作,匹配不在这里面的值
     * [aA] 正值操作,匹配在里面的值
     *
     * @param
     * @return
     * @author bruce.sun
     * @date 2018/6/6
     */
    public int jewelsAndStones3(String j, String s) {
        String result = s.replaceAll("[^" + j + "]", "");
        System.out.println(result);
        return result.length();
    }

    /**
     * 第四种解决方案:
     * 添加一个
     *
     *
     * @param
     * @return
     * @author bruce.sun
     * @date 2018/6/6
     */
    public int jewelsAndStones4(String j, String s) {
        int jewels=0;
        for(char c:s.toCharArray()){
            if(j.indexOf(c) != -1){
                jewels++;
            }
        }
        return jewels;
    }

}
