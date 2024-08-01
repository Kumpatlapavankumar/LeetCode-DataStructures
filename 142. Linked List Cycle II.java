/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
//don't edit this code 
        ListNode sp=head,fp=head;
        while(fp!=null && fp.next!=null){
            sp=sp.next;
            fp=fp.next.next;
            if(sp==fp){
                sp=head;
                while(sp!=fp){
                    sp=sp.next;
                    fp=fp.next;
                }
                return sp;
            }
        }
        return null;
    }
}
