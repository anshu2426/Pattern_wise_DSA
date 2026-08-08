class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode t=head;
        ListNode h=head;
        boolean c=false;
        ListNode p=head;
        while(t!=null&&t.next!=null){
            ListNode n=t.next.next;
            ListNode s=t.next;
            s.next=t;
            t.next=n;
            if(!c){
                h=s;
                c=true;
            }
            else{
                p.next=s;
            }
            p=t;
            t=t.next;
        }
        return h;
    }
}