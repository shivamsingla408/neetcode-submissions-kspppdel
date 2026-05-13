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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        if(head==null || head.next==null)return false;
        ListNode fast = head.next.next;
        
        while(fast!=null){
            if(slow==fast)return true;
            else{
                slow= slow.next;
                if(fast.next==null)return false;
                fast=fast.next.next;
            }
        }
        return false;
    }
}
