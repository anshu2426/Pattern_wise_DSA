class Solution {
    class pair{
        char c;
        int f;
        pair(char c,int f){
            this.c=c;
            this.f=f;
        }
    }
    public int leastInterval(char[] t, int n) {
        int[] a=new int[26];
        for(int i=0;i<t.length;i++){
            a[t[i]-'A']++;
        }
        PriorityQueue<pair>b=new PriorityQueue<>((c,d)->(d.f-c.f));
       for(int i=0;i<a.length;i++){
       if(a[i]!=0) b.add(new pair((char)('A'+i),a[i]));
       }
        int count=0; 
        while(b.size()>0){
            int max=b.peek().f;
            ArrayList<pair>x=new ArrayList<>();
           
            x.add(b.remove());
            count++;
            for(int i=0;i<n;i++){
              if(b.size()==0){
               if(max==1) return count;
               count=count+n-i;
                break;
              }
              else {
                x.add(b.remove());
                count++;    
              }
            }
            for(int i=0;i<x.size();i++){
                if(x.get(i).f!=1)b.add(new pair(x.get(i).c,x.get(i).f-1));
            }
        }
        
        return count;
    }
}