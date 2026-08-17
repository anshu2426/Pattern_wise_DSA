class Solution {
    public ListNode mergeKLists(ListNode[] l) {
        PriorityQueue<ListNode>a=new PriorityQueue<>((c,d)->(c.val-d.val));
        for(int i=0;i<l.length;i++){
          if(l[i]!=null)a.add(l[i]);
        }
        ListNode d=new ListNode(-1);
        ListNode t=d;
        while(a.size()>0){
            ListNode r=a.remove();
             t.next=r;
            t=t.next;
           if(r.next!=null) a.add(r.next);
        }
        t.next=null;
        return d.next;
    }
}