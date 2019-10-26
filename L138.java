package LeetCode;

public class L138 {
    public RandomNode copyRandomList(RandomNode head) {
        if (head == null) return null;
        RandomNode ptr = head;
        while (ptr != null){
            RandomNode newNode = new RandomNode();
            newNode.val = ptr.val;
            newNode.next = ptr.next;
            ptr.next = newNode;
            ptr = newNode.next;
        }
        ptr = head;
        while (ptr != null){
            ptr.next.random = (ptr.random != null) ? ptr.random.next : null;
            ptr = ptr.next.next;
        }
        RandomNode preHead = head;
        RandomNode newHead = head.next;
        RandomNode res = newHead;
        while (newHead != null){
            preHead.next = preHead.next.next;
            newHead.next = newHead.next != null?newHead.next.next : null;
            preHead = preHead.next;
            newHead = newHead.next;
        }
        return res;
    }
}
