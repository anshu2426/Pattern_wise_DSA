public class ListCycle2 {
    public ListNode detectCycle(ListNode head) {
    
        ListNode s=head;
        ListNode f=head;
        boolean c=false;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                c=true;
                break;
            }
        }
        if(c==false)return null;
        while(head!=f){
            head=head.next;
            f=f.next;
        }
        return head;
    }
}