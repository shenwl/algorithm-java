import base.ListNode;

/**
 * leetcode 206
 * https://leetcode-cn.com/problems/reverse-linked-list/submissions/
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode p = head;
        ListNode pNext = head.next;

        p.next = null;

        while(pNext != null) {
            ListNode tmp = pNext.next;
            pNext.next = p;
            p = pNext;
            pNext = tmp;
        }

        return p;
    }
}
