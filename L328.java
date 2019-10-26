package LeetCode;

public class L328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode preHead = head;
        ListNode endHead = head.next;
        ListNode left = preHead;
        ListNode right = endHead;
        while (endHead != null && endHead.next != null){
            preHead.next = endHead.next;
            endHead.next = endHead.next.next;
            preHead = preHead.next;
            endHead = endHead.next;
        }
        preHead.next = right;
        return left;
    }
}
