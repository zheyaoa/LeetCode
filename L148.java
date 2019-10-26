package LeetCode;

public class L148 {
    public static void main(String[] args){
        ListNode head = ListNode.MakeList(new int[]{4,2,3,1});
        ListNode tmp = sortList(head);
        System.out.println(tmp);
    }
    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode fast = head.next;
        ListNode low = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            low = low.next;
        }
        ListNode right = low.next;
        low.next = null;
        head = sortList(head);
        right = sortList(right);
        ListNode res = new ListNode(0);
        ListNode tmp = res;
        while(head != null && right != null){
            if(head.value <= right.value){
                tmp.next = head;
                head = head.next;
            }else {
                tmp.next = right;
                right = right.next;
            }
            tmp = tmp.next;
        }
        tmp.next = head != null?head:right;
        return res.next;
    }
}