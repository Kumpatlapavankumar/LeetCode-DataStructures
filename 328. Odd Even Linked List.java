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
    public ListNode oddEvenList(ListNode head) {
        ListNode es=null,ee=null;
        ListNode os=null,oe=null;
        ListNode temp=head;
        int x=0;
        while(temp!=null){
            if(x%2==0){
                if(es==null){
                    es=ee=temp;
                }else{
                    ee.next=temp;
                    ee=ee.next;
                }
            }else{
                if(os==null){
                    os=oe=temp;
                }else{
                    oe.next=temp;
                    oe=oe.next;
                }
            }
            temp=temp.next;
            x++;
        }
        if(os==null){
            return es;
        }
        if(es==null){
            return os;
        }
        ee.next=os;
        oe.next=null;
        return es;
    }
}
