class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode c=null;
       ListNode t=head;
       while(t!=null){
        ListNode n=t.next;
        t.next=c;
        c=t;
        t=n;
       }
       return c;
    }
}