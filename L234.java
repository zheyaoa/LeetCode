package LeetCode;

public class L234 {
    public static void main(String[] args){
        ListNode head = ListNode.MakeList(new int[]{1,2,2,1});
        System.out.println(isPalindrome(head));
    }
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode fast = head.next;
        ListNode low = head;
        while (fast != null&&fast.next != null){
            fast = fast.next.next;
            low = low.next;
        }
        ListNode right = low.next;
        low.next = null;
        ListNode left = head;
        left = reverseList(left);
        if (fast == null){
            left = left.next;
        }
        while (left != null && right != null){
            if (left.value != right.value)return false;
            left = left.next;
            right = right.next;
        }
        return left==right;
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
