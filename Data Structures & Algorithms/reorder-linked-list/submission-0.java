/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)return ;
        ListNode slow= head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        ListNode first = head;
        ListNode second = prev;
        while(second!=null){
            ListNode tp1=first.next;
            ListNode tp2 = second.next;
            first.next = second;
            second.next=tp1;
            first = tp1;
            second= tp2;

        }
    }
}
