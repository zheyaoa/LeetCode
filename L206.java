package LeetCode;

public class L206 {
    public static void main(String[] args){
        ListNode head = ListNode.MakeList(new int[]{1,2,3,4,5});
        reverseList(head);
    }
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null){
            ListNode nextNode = head.next;
            head.next = pre;
            pre = head;
            head = nextNode;
        }
        return pre;
    }
}
