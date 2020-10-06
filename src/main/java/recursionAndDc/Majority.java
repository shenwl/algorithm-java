package recursionAndDc;

import java.util.HashMap;

/**
 * leetcode 169 easy
 * https://leetcode-cn.com/problems/majority-element/submissions/
 * 解法1：map
 * 解法2：sort之后再看重复次数
 * 解法3：D&C，把数组1分为2，左右majority相同，则为这个数，如果不同，返回count大的
 */
public class Majority {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            Integer count = map.get(val);
            if (count != null) {
                map.put(val, count + 1);
            } else {
                map.put(val, 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 2) {
                return key;
            }
        }
        return -1;
    }
}
