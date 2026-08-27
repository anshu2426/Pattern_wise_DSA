class Solution {
    class pair{
        int i;
        int j;
        pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    public int orangesRotting(int[][] g) {
         Queue<pair>q=new ArrayDeque<>();
         int f=0;
         for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
               if(g[i][j]==2){
                 q.add(new pair(i,j));
               }
               else if(g[i][j]==1){
                f++;
               }
            }
         }
         int t=0;
         while(q.size()>0&&f>0){
            int s=q.size();
            while(s>0){
                pair p=q.remove();
                int x=p.i;
                int y=p.j;
                if(x-1>=0&&g[x-1][y]==1){
                    q.add(new pair(x-1,y));
                    g[x-1][y]=2;
                    f--;
                }
                if(x+1<g.length&&g[x+1][y]==1){
                    q.add(new pair(x+1,y));
                    g[x+1][y]=2;
                     f--;
                }
                if(y-1>=0&&g[x][y-1]==1){
                    q.add(new pair(x,y-1));
                    g[x][y-1]=2;
                     f--;
                }
                if(y+1<g[0].length&&g[x][y+1]==1){
                    q.add(new pair(x,y+1));
                    g[x][y+1]=2;
                     f--;
                }
                s--;
            }
            t++;
         }
         if(f>0)return -1;
         return t;
    }
}