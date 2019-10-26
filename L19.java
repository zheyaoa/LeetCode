package LeetCode;


public class L19 {
    public static void main(String[] args){
        int[] arr =  {1,2,3,4,5};
        ListNode root = ListNode.MakeList(arr);
        root = removeNthFromEnd(root,1);
        ListNode.printf(root);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        head = pre;
        ListNode end = head.next;
        while (n!=0){
            end = end.next;
            n--;
        }
        while (end != null){
            pre = pre.next;
            end = end.next;
        }
        pre.next = pre.next.next;
        return head.next;
    }
}
