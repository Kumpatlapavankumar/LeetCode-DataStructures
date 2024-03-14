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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null ||head.next==null){
            return null;
        }
        ListNode first=head;
        ListNode second=head.next.next;
        while(second!=null && second.next!=null){
            first=first.next;
            second=second.next.next;
        }
        first.next=first.next.next;
        return head;
    }
}
