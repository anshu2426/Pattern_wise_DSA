class Solution {
    boolean f;
    public void dfs(int[][] g,int i,int[] c,int x){ 
        if(c[i]!=0){
            if(c[i]%2!=x%2){
                f=false;
            }
            return ;
        }
        c[i]=x;
        for(int j=0;j<g[i].length;j++){
          dfs(g,g[i][j],c,x+1);
          if(!f)return ;
        }
    }
    public boolean isBipartite(int[][] g) {
        int[] c=new int[g.length];
        f=true;
        for(int i=0;i<g.length;i++){
            if(c[i]==0)dfs(g,i,c,1);
            if(!f)return false;
        }
        return true;
    }
}