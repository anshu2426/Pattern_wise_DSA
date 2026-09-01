class Solution {
    class pair{
        int p;
        int d;
        pair(int p,int d){
            this.p=p;
            this.d=d;
        }
    }
    public int spanningTree(int V, int[][] e) {
      ArrayList<ArrayList<pair>>a=new ArrayList<>();
      for(int i=0;i<V;i++){
          a.add(new ArrayList<pair>());
      }
      for(int i=0;i<e.length;i++){
          a.get(e[i][0]).add(new pair(e[i][1],e[i][2]));
          a.get(e[i][1]).add(new pair(e[i][0],e[i][2]));
      }
      int[] v=new int[V];
     
      PriorityQueue<pair>q=new PriorityQueue<>((x,y)->(x.d-y.d));
      q.add(new pair(0,0));
      int s=0;
      while(q.size()>0){
          pair t=q.remove();
          if(v[t.p]==1)continue;
          v[t.p]=1;
          s=s+t.d;
          for(int i=0;i<a.get(t.p).size();i++){
            if(v[a.get(t.p).get(i).p]!=1) q.add(new pair(a.get(t.p).get(i).p,a.get(t.p).get(i).d));
          }
      }
      return s;
    }
}
