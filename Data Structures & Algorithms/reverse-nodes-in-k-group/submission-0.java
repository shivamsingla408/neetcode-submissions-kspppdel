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
    public ListNode reverse(ListNode l){
        ListNode curr = l;
        ListNode prev = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode findk(ListNode temp , int k){
        while(temp!=null && k>1){
            k--;
            temp = temp.next;
        }
        if(k>1)return null;
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
       ListNode prev =null;
        while(temp!=null){
            ListNode kth = findk(temp,k);

            if(kth==null){
                if(prev!=null)prev.next = temp;
                break;
            }
           ListNode nextnode = kth.next;
           kth.next = null;
                   reverse(temp);
            if(head==temp){
                head = kth;
            }
            else{
                 prev.next = kth ;
                
            }
            prev = temp;
            temp = nextnode;
        }
        

       return head; 
    }
}
