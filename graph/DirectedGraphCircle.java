class Solution {
    boolean c;
      HashSet<Integer>b;
    public void dfs(ArrayList<ArrayList<Integer>>a,int x,int[] v,int[] p){
        if(c)return ;
        if(v[x]==1)return ;
        if(p[x]==1){
            for(int i=0;i<a.get(x).size();i++){
                if(p[a.get(x).get(i)]==1){
                    c=true;
                   return ;
                }
            }
            return ;
        }
        
        p[x]=1;
        for(int i=0;i<a.get(x).size();i++){
            dfs(a,a.get(x).get(i),v,p);
        }
        p[x]=0;
        v[x]=1;
    }
    public boolean isCyclic(int V, int[][] e) {
        c=false;
        int[] p=new int[V];
        int[] v=new int[V];
       ArrayList<ArrayList<Integer>>a=new ArrayList<>();
       for(int i=0;i<V;i++){
           a.add(new ArrayList<Integer>());
       }
       for(int i=0;i<e.length;i++){
           a.get(e[i][0]).add(e[i][1]);
       }
       
       for(int i=0;i<a.size();i++){
        if(a.get(i).size()>0)  dfs(a,i,v,p);
       }
       return c;
    }
}