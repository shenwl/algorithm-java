import base.ListNode;

/**
 * leetcode 206
 * https://leetcode-cn.com/problems/reverse-linked-list/submissions/
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev = head;
        ListNode cur = head.next;

        head.next = null;

        while(cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
