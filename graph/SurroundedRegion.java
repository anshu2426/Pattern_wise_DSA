class Solution {
    public void dfs(char[][] b,int[][] v,int i,int j){
        if(i<0||j<0||i==b.length||j==b[0].length)return ;
        if(v[i][j]==1)return ;
        if(b[i][j]!='O')return ;
        v[i][j]=1;
        dfs(b,v,i-1,j);
        dfs(b,v,i+1,j);
        dfs(b,v,i,j-1);
        dfs(b,v,i,j+1);
    }
    public void solve(char[][] b) {
       int[][] v=new int[b.length][b[0].length];
       for(int i=0;i<b.length;i++){
        for(int j=0;j<b[0].length;j++){
            if((i==0||j==0||i==b.length-1||j==b[0].length-1)&&b[i][j]=='O')dfs(b,v,i,j);
        }
       }
       for(int i=0;i<b.length;i++){
        for(int j=0;j<b[0].length;j++){
            if(v[i][j]==0)b[i][j]='X';
        }
       }

    }
}