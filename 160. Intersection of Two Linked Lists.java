/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1=headA;
        ListNode curr2=headB;
        int c1=countnodes(headA);
        int c2=countnodes(headB);
        if(c1>c2){
            int d=c1-c2;
            int count=0;
            while(curr1!=null && count<d){
                curr1=curr1.next;
                count++;
            }
            while(curr1!=null && curr2!=null){
                if(curr1==curr2){
                    return curr1;
                }
                curr1=curr1.next;
                curr2=curr2.next;
            }
        }else{
            int d=Math.abs(c2-c1);
            int count=0;
            while(curr2!=null && count<d){
                curr2=curr2.next;
                count++;
            }
            while(curr1!=null && curr2!=null){
                if(curr1==curr2){
                    return curr1;
                }
                curr1=curr1.next;
                curr2=curr2.next;
            }
        }
        return null;
    }
    public int countnodes(ListNode head){
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
}
