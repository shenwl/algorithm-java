package mapAndSet;

import java.util.*;

/**
 * leetcode 15
 * https://leetcode-cn.com/problems/3sum/
 * 解法1：三层嵌套循环 O(n3)
 * 解法2: 两层循环枚举a, b，优化c的查找 O(n2)，可以用Set
 * 解法3：sort-find：O(n2）
 * 先排序
 * 第一层循环枚举a，
 * 然后再剩下数组找b和c（指针从两边往中间）
 * a+b+c > 0，c往左，反之b往右
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return new ArrayList<>();

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];

            if (a > 0) break;
            if (i > 0 && a == nums[i - 1]) continue;

            int target = -a;
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int b = nums[left];
                int c = nums[right];
                if (b + c == target) {
                    result.add(new ArrayList<>(List.of(a, b, c)));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                } else if (b + c > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}
