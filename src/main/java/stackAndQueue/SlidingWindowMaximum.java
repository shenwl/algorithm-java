package stackAndQueue;

import java.util.ArrayList;

/**
 * leetcode 239
 * https://leetcode-cn.com/problems/sliding-window-maximum/
 * 方法1：优先队列，用一个maxHeap（root最大），窗口移动之后第一个元素去掉，下一个元素加入，每次返回peek()
 * 方法2（内存更优）：双端队列，每次滑动窗口，比后面一个小的都可以不要了，可以用deque（双端队列，数组实现）
 */
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length <= 1) return nums;

        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> window = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            // 右移后左界删除
            if(i >= k && window.get(0) <= i - k) {
                window.remove(0);
            }
            // 删除左侧小于当前最右值的内容
            while(!window.isEmpty() && nums[window.get(window.size() - 1)] <= n) {
                window.remove(window.size() - 1);
            }
            window.add(i);
            if(i >= k - 1) {
                res.add(nums[window.get(0)]);
            }
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }
}
