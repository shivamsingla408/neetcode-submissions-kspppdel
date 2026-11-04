class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);   // NEW
        ListNode before = dummy;                  // NEW

        int poi = 1;                              // CHANGED: was 0
        while(poi<left){
            before = before.next;                 // CHANGED: walk `before`, not curr
            poi++;
        }
        ListNode curr = before.next;              // NEW: node at position left

        ListNode curr2 = curr.next;
        ListNode prev = curr;

        while(left<right && curr2!=null){
            ListNode temp = curr2.next;
            curr2.next = prev;
            prev = curr2;
            curr2 = temp;
            left++;                               // NEW
        }

        before.next = prev;                       // NEW
        curr.next = curr2;                        // NEW
        return dummy.next;                        // CHANGED: was head
    }
}