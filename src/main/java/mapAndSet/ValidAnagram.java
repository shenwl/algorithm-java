package mapAndSet;

import java.util.HashMap;

/**
 * leetcode 242
 * https://leetcode-cn.com/problems/valid-anagram/
 * 方法1：排序，把字符串的所有字母按字典序排序，之后比较排序好的单词是否一致。时间复杂度O(nlogn)
 * 方法2：Map统计每个字母出现的次数
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap();
        HashMap<Character, Integer> map2 = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer count = map1.get(c);
            map1.put(c, count != null ? (count + 1) : 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            Integer count = map2.get(c);
            map2.put(c, count != null ? (count + 1) : 1);
        }
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        System.out.println("test isAnagram");
        System.out.println(new ValidAnagram().isAnagram("aacc", "ccac"));;
        System.out.println(new ValidAnagram().isAnagram("aacc", "ccaa"));;
    }
}
