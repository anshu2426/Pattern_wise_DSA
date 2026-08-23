class Solution {
    public void connect(char[][] g,int i,int j,int[][] v){
        if(i<0||j<0||i==g.length||j==g[0].length||g[i][j]=='0'||v[i][j]==1)return ;
        v[i][j]=1;
        connect(g,i+1,j,v);
        connect(g,i-1,j,v);
        connect(g,i,j+1,v);
        connect(g,i,j-1,v);
    }
    public int numIslands(char[][] g) {
        int[][] v=new int[g.length][g[0].length];
        int c=0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[i].length;j++){
                if(g[i][j]=='1'&&v[i][j]==0){
                    connect(g,i,j,v);
                    c++;
                }
            }
        }
        return c;
    }
}