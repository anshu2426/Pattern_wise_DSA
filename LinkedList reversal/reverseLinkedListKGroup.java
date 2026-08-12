class Solution {
    public ListNode reverse(ListNode head){
        ListNode p=null;
        ListNode c=head;
        while(c!=null){
            ListNode n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1)return head;
        ListNode p=null;
        ListNode t=head;
        ListNode h=null;
        int c=1;
        ListNode r=head;
        while(t!=null){
            if(c==k){
            if(h==null){
            ListNode n=t.next;
            t.next=null;
            ListNode d=reverse(r);
            h=d;
            r.next=n;
            p=r;
            c=0;
            t=r;
            }
            else if(h!=null){
             ListNode n=t.next;
             t.next=null;
             ListNode d=reverse(r);
             p.next=d;
             r.next=n;
             p=r;
             c=0;
             t=r;
            }
            }
            if(c==1)r=t;
            c++;
            t=t.next;
        }
        return h;
    }
}