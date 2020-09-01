package linkedList;

import base.ListNode;

/**
 * leetcode 24
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode newHead = head.next;

        ListNode pre = null;
        ListNode cur = head;
        ListNode next = head.next;

        while(next != null) {
            ListNode third = next.next;

            if(pre != null) {
                pre.next = next;
            }
            next.next = cur;
            cur.next = third;

            if(third == null) {
                break;
            }

            pre = cur;
            cur = third;
            next = cur.next;
        }

        return newHead;
    }
}
