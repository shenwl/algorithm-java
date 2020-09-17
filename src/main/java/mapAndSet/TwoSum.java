package mapAndSet;

import java.util.HashMap;

/**
 * leetcode 1
 * https://leetcode-cn.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int matchEl = target - nums[i];

            if (!map.isEmpty() && map.containsKey(matchEl)) {
                result[1] = i;
                result[0] = map.get(matchEl);
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
