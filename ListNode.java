package LeetCode;


import java.util.*;

public class ListNode {
    int value;
    ListNode next = null;
    public ListNode(int val){
        this.value = val;
    }
    public static ListNode MakeList(int[] arr){
        ListNode root = new ListNode(arr[0]);
        ListNode pre = root;
        for (int i=1;i<arr.length;i++){
            ListNode tmp = new ListNode(arr[i]);
            pre.next = tmp;
            pre = tmp;
        }
        return root;
    }
    public static void printf(ListNode root){
        while (root!=null){
            System.out.println(root.value);
            root = root.next;
        }
    }
}
