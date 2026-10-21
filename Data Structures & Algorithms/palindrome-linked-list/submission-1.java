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
    public boolean isPalindrome(ListNode head) {
        ListNode head1 = head;
        ListNode cur = head;
        ListNode prev= null;
        while(cur!=null){
             ListNode temp = new ListNode(cur.val);
             temp.next = prev;
             prev = temp;
             cur = cur.next;
        }
        while(prev!=null && head!=null){
            if(prev.val ==head.val){
                prev = prev.next;
                head = head.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
}