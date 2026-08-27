class Solution {
    boolean c;
    public void dfs(ArrayList<ArrayList<Integer>>a,int[] t,int i,int p){
        if(c)return ;
        if(t[i]==1){
            c=true;
            return ;
        }
         t[i]=1;
        for(int j=0;j<a.get(i).size();j++){
            if(p!=a.get(i).get(j))dfs(a,t,a.get(i).get(j),i);
        }
    }
    public boolean isCycle(int V, int[][] e) {
      c=false;
      int[] t=new int[V];
      ArrayList<ArrayList<Integer>>a=new ArrayList<>();
      for(int i=0;i<V;i++){
          a.add(new ArrayList<Integer>());
      }
      for(int i=0;i<e.length;i++){
          a.get(e[i][0]).add(e[i][1]);
          a.get(e[i][1]).add(e[i][0]);
      }
      for(int i=0;i<a.size();i++){
          if(t[i]==0){
              dfs(a,t,i,-1);
          }
          if(c)return c;
           
      }
      return c;
    }
}