import base.ListNode;

import java.util.ArrayList;

/**
 * leetcode 141
 * https://leetcode-cn.com/problems/linked-list-cycle/
 * 要求：O(1)空间复杂度的环检测
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ArrayList<ListNode> visited = new ArrayList<>();

        ListNode cur = head;

        while (cur != null) {
            if (visited.contains(cur)) {
                return true;
            }
            visited.add(cur);
            cur = cur.next;
        }
        return false;
    }
}
