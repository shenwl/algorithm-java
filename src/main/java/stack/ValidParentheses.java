package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * leetcode 20
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        List<Character> left = List.of('(', '[', '{');
        List<Character> right = List.of(')', ']', '}');

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if (left.contains(c)) {
                stack.push(c);
            } else if (right.contains(c)) {
                if (stack.isEmpty()) return false;

                Character leftBracket = stack.pop();
                if (left.indexOf(leftBracket) != right.indexOf(c)) {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
