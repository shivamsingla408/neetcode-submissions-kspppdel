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
        
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(l1!=null || l2!=null){
            int value =0;
            if(l1==null)value = l2.val+carry;
            else if(l2==null)value = l1.val+carry;
            else{
                value = l2.val+l1.val+carry;
            }
           
            int addi  = value%10;
            carry = value/10;
            ListNode temp = new ListNode(addi);
            curr.next = temp;
            curr = temp;
            if(l1!=null)
            l1 = l1.next;
            if(l2!=null)
            l2 = l2.next;
           
        }
        if(carry>0){
            ListNode temp = new ListNode(carry);
            curr.next = temp;
        }
        return dummy.next;
     
    }
}
