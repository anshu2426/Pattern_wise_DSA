class Solution {
    class pair{
        int p;
        int d;
        pair(int p,int d){
            this.p=p;
            this.d=d;
        }
    }
    public int networkDelayTime(int[][] t, int n, int k) {
        ArrayList<ArrayList<pair>>a=new ArrayList<>();
        for(int i=0;i<=n;i++){
            a.add(new ArrayList<pair>());
        }
        for(int i=0;i<t.length;i++){
            a.get(t[i][0]).add(new pair(t[i][1],t[i][2]));
        }
        PriorityQueue<pair>q=new PriorityQueue<>((x,y)->(x.d-y.d));
        int[] dist=new int[n+1];
        for(int i=0;i<=n;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[k]=0;
        q.add(new pair(k,0));
        while(q.size()>0){
            pair r=q.remove();
            if(dist[r.p]<r.d)continue;
            for(int i=0;i<a.get(r.p).size();i++){
               if(dist[a.get(r.p).get(i).p]>a.get(r.p).get(i).d+r.d){
                 dist[a.get(r.p).get(i).p]=a.get(r.p).get(i).d+r.d;
                q.add(new pair(a.get(r.p).get(i).p,a.get(r.p).get(i).d+r.d));
               }
            }
        } 
          int max=-1;
          for(int i=1;i<=n;i++){
            max=Math.max(dist[i],max);
          }  
          if(max==Integer.MAX_VALUE)return -1;
          return max;
    }
}