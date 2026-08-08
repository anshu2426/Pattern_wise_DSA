class Solution {
    public ListNode reverse(ListNode head){
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)return head;
        if(left==1){
             ListNode t=head;
        int c=1;
        ListNode r=null;
        while(t!=null){
          
             if(c==right){
                r=t;
            }
            t=t.next;
            c++;
        }
        ListNode d=r.next;
        r.next=null;
        reverse(head);
        head.next=d;
        return r;
        }
        ListNode t=head;
        int c=1;
        ListNode l=head,r=null;
        while(t!=null){
            if(c==left-1){
                l=t;
            }
            else if(c==right){
                r=t;
            }
            t=t.next;
            c++;
        }
        ListNode d=r.next;
        r.next=null;
        ListNode n=l.next;
        l.next=reverse(n);
        n.next=d;
        
        return head;
    }
}