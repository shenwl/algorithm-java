package stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * leetcode 20
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>(3);
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                if (map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // 不用栈的解法, leetcode用例测试性能不如前一种
    public boolean isValid2(String s) {
        int len;
        do{
            len = s.length();
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        } while(len != s.length());

        return s.length() == 0;
    }
}
