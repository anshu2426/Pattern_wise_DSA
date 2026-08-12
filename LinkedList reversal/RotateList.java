class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0||head==null)return head;
        int c1=0;
        ListNode t=head;
        ListNode last=head;
        while(t!=null){
            c1++;
            last=t;
            t=t.next;
        }
        k=k%c1;
        if(k==0)return head;
        int c2=1;
        t=head;
        while(c2!=c1-k){
            c2++;
            t=t.next;
        }
        ListNode n=t.next;
        t.next=null;
        last.next=head;
        return n;
    }
}