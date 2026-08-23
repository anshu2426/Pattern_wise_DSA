//dfs
class Solution {
    public void dfs(int[][]n ,int[] v,int i){
        if(v[i]==1)return ;
        v[i]=1;
        for(int j=0;j<n[i].length;j++){
            if(n[i][j]==1)dfs(n,v,j);
        }
    }
    public int findCircleNum(int[][] n) {
        int[] v=new int[n.length];
        int s=0;
        for(int i=0;i<n.length;i++){
            if(v[i]==0){
                dfs(n,v,i);
                s++;
            }
        }
        return s;
    }
}