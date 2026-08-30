class Solution {
    
    public int shortestPath(int V, int[][] e, int src, int dest) {
      ArrayList<ArrayList<Integer>>a=new ArrayList<>();
      for(int i=0;i<V;i++){
          a.add(new ArrayList<Integer>());
      }
      int[] v=new int[V];
      for(int i=0;i<e.length;i++){
          a.get(e[i][0]).add(e[i][1]);
          a.get(e[i][1]).add(e[i][0]);
      }
      Queue<Integer>q=new ArrayDeque<>();
      q.add(src);
      v[src]=1;
      int k=0;
      while(q.size()>0){
          int s=q.size();
          while(s>0){
              int r=q.remove();
            if(r==dest)return k;
            for(int j=0;j<a.get(r).size();j++){
             if(v[a.get(r).get(j)]==0){
                   q.add(a.get(r).get(j));
                   v[a.get(r).get(j)]=1;
             }
          }
            s--;
          }
          k++;
      }
      return -1;
    }
}