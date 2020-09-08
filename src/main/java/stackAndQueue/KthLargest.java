package stackAndQueue;

import java.util.PriorityQueue;

/**
 * leetcode 703
 * https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/
 * 方法1：记录保存k个最大值，每次进来一个书都进行排序，把里面最小的淘汰，时间复杂度: NKLogK
 * 方法2：优先队列，把最大/最小的元素放在最上面，这里采用的方法是维护一个MinHeap，size = k（k大元素在堆顶），时间复杂度log2K
 */
class KthLargest {
    final PriorityQueue<Integer> q;
    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue<>(k);
        for (int n : nums) {
            add(n);
        }
    }

    public int add(int val) {
        if (q.size() < k) {
            q.offer(val);
        } else if (q.peek() < val) {
            q.poll();
            q.offer(val);
        }
        return q.peek();
    }
}