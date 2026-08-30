class Solution {
    class pair{
        int p;
        int d;
        pair(int p,int d){
            this.p=p;
            this.d=d;
        }
    }
    public ArrayList<Integer> dijkstra(int V, int[][] e, int src) {
        ArrayList<ArrayList<pair>>a=new ArrayList<>();
        for(int i=0;i<V;i++){
            a.add(new ArrayList<pair>());
        }
        for(int i=0;i<e.length;i++){
            a.get(e[i][0]).add(new pair(e[i][1],e[i][2]));
            a.get(e[i][1]).add(new pair(e[i][0],e[i][2]));
        }
        int[] dist=new int[V];
        for(int i=0;i<V;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[src]=0;
        
        PriorityQueue<pair>q=new PriorityQueue<>((x,y)->(x.d-y.d));
        q.add(new pair(src,dist[src]));
        while(q.size()>0){
            pair t=q.remove();
            if(dist[t.p]<t.d)continue;
            for(int i=0;i<a.get(t.p).size();i++){
               if(dist[a.get(t.p).get(i).p]>t.d+a.get(t.p).get(i).d){
                   dist[a.get(t.p).get(i).p]=t.d+a.get(t.p).get(i).d;
                   q.add(new pair(a.get(t.p).get(i).p,t.d+a.get(t.p).get(i).d));
               }
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<V;i++){
            ans.add(dist[i]);
        }
        return ans;
    }
}