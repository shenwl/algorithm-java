import base.ListNode;

import java.util.ArrayList;

/**
 * leetcode 141
 * https://leetcode-cn.com/problems/linked-list-cycle/
 * 要求：O(1)空间复杂度的环检测 - 快慢指针
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode quick = head.next;

        while(quick != null) {
            quick = quick.next;

            if(quick == slow) return true;
            if(quick == null) return false;

            quick = quick.next;
            slow = slow.next;
        }

        return false;
    }
}
