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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode curr=head;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        if(length==1 && n==1){
            head=head.next;
            return head;
        }
        int node=length-n;
        
        if(node==0){
            return head.next;
        }
        curr=head;
        for(int i=1;i<node;i++){
            curr=curr.next;
        }
        if(curr.next==null){
            return curr;
        }else{
            curr.next=curr.next.next;
        }
        return head;
    }
}
