package com.practice.leetCode.q0657_JudgeRouteCircle;

/**
 * Question :
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves,
 * judge if this robot makes a circle, which means it moves back to the original place.
 * <p>
 * The move sequence is represented by a string. And each move is represent by a character.
 * The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true
 * or false representing whether the robot makes a circle.
 * <p>
 * Example 1:
 * Input: "UD"
 * Output: true
 * <p>
 * Example 2:
 * Input: "LL"
 * Output: false
 *
 * @author bruce.sun
 * @date 2018/6/9
 */
public class JudgeRouteCircleSolution {

    public boolean solution1(String str) {
        //横向
        int x = 0;
        //纵向
        int y = 0;

        for (char move : str.toCharArray()) {
            if (move == 'U') {
                y++;
            }
            if (move == 'D') {
                y--;
            }
            if (move == 'L') {
                x--;
            }
            if (move == 'R') {
                x++;
            }
        }

        return x == 0 && y == 0;

    }
}
