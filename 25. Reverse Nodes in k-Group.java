class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        ListNode prevTail = null;
        
        while (curr != null) {
            ListNode first = curr;
            ListNode prev = null;
            int count = 0;
            
            // Traverse k nodes to reverse
            while (curr != null && count < k) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
            
            // If less than k nodes remain, reverse them back to original order
            if (count < k) {
                ListNode reverseHead = prev;
                prev = null;
                while (reverseHead != null) {
                    ListNode next = reverseHead.next;
                    reverseHead.next = prev;
                    prev = reverseHead;
                    reverseHead = next;
                }
                if (prevTail == null) {
                    head = prev;
                } else {
                    prevTail.next = prev;
                }
                break; // No need to proceed further
            }
            
            // Connect the reversed group to the previous tail or update head
            if (prevTail == null) {
                head = prev;
            } else {
                prevTail.next = prev;
            }
            
            // Update prevTail to the current group's tail
            prevTail = first;
        }
        
        return head;
    }
}
