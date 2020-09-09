package mapAndSet;

import java.util.HashMap;

/**
 * leetcode 242
 * https://leetcode-cn.com/problems/valid-anagram/
 * 方法1：排序，把字符串的所有字母按字典序排序，之后比较排序好的单词是否一直。时间复杂度O(nlogn)
 * 方法2：Map统计每个字母出现的次数
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer count = map.get(c);
            map.put(c, count != null ? (count + 1) : 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            Integer count = map.get(c);
            if (count == null || count == 0) {
                return false;
            }
            map.put(c, count - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("test isAnagram");
        System.out.println(new ValidAnagram().isAnagram("aacc", "ccac"));;
    }
}
