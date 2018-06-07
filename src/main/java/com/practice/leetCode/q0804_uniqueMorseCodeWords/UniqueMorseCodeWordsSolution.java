package com.practice.leetCode.q0804_uniqueMorseCodeWords;

import java.util.HashSet;
import java.util.Set;

/**
 * 英文字母转换成摩斯码,找出相同的摩斯码个数.
 * Question:
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes,
 * as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 * <p>
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 * <p>
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
 * "...","-","..-","...-",".--","-..-","-.--","--.."]
 * <p>
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter.
 * For example, "cab" can be written as "-.-.-....-"
 * Return the number of different transformations among all words we have.
 * <p>
 * Example:
 * Input: words = ["gin", "zen", "gig", "msg"]
 * Output: 2
 * Explanation:
 * The transformation of each word is:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 * <p>
 * There are 2 different transformations, "--...-." and "--...--.".
 *
 * @author bruce.sun
 * @date 2018/6/6
 */
public class UniqueMorseCodeWordsSolution {

    /**
     *   获取ascii码 映射到数组,并且循环
     * @author bruce.sun
     * @date 2018/6/7
     * @param
     * @return
     *
     */
    public int solution1(String[] words) {
        int result = 0;
        if (words == null) {
            return result;
        }

        String[] morseCode=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set set=new HashSet();
        for(String s:words){
            char[] charArray=s.toLowerCase().toCharArray();
            StringBuffer sb=new StringBuffer();
            for(char c:charArray){
                int cur = Integer.valueOf(c);
                int startA = Integer.valueOf('a');
                int index=cur-startA;
                sb.append(morseCode[index]);
            }
            System.out.println("---------");
            System.out.println(sb.toString());
            set.add(sb.toString());
        }
        result=set.size();
        return result;
    }


}

