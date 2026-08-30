class Solution {
    class pair{
        int u;
        int v;
        int d;
        pair(int u,int v,int d){
            this.u=u;
            this.v=v;
            this.d=d;
        }
    }
    public int minimumEffortPath(int[][] h) {
        int[][] w=new int[h.length][h[0].length];
        for(int i=0;i<h.length;i++){
            for(int j=0;j<h[0].length;j++){
                w[i][j]=Integer.MAX_VALUE;
            }
        }
        w[0][0]=0;
        PriorityQueue<pair>q=new PriorityQueue<>((x,y)->(x.d-y.d));
        q.add(new pair(0,0,0));
        while(q.size()>0){
            pair r=q.remove();
            if(r.u+1<w.length&&w[r.u+1][r.v]>w[r.u][r.v]&&w[r.u+1][r.v]>Math.abs(h[r.u][r.v]-h[r.u+1][r.v])){
                w[r.u+1][r.v]=Math.max(Math.abs(h[r.u][r.v]-h[r.u+1][r.v]),w[r.u][r.v]);
                q.add(new pair(r.u+1,r.v,w[r.u+1][r.v]));  
             }
             if(r.u-1>=0&&w[r.u-1][r.v]>w[r.u][r.v]&&w[r.u-1][r.v]>Math.abs(h[r.u][r.v]-h[r.u-1][r.v])){
                w[r.u-1][r.v]=Math.max(Math.abs(h[r.u][r.v]-h[r.u-1][r.v]),w[r.u][r.v]);
                q.add(new pair(r.u-1,r.v,w[r.u-1][r.v]));  
             }
             if(r.v+1<w[0].length&&w[r.u][r.v+1]>w[r.u][r.v]&&w[r.u][r.v+1]>Math.abs(h[r.u][r.v]-h[r.u][r.v+1])){
                w[r.u][r.v+1]=Math.max(Math.abs(h[r.u][r.v]-h[r.u][r.v+1]),w[r.u][r.v]);
                q.add(new pair(r.u,r.v+1,w[r.u][r.v+1]));  
             }
             if(r.v-1>=0&&w[r.u][r.v-1]>w[r.u][r.v]&&w[r.u][r.v-1]>Math.abs(h[r.u][r.v]-h[r.u][r.v-1])){
                w[r.u][r.v-1]=Math.max(Math.abs(h[r.u][r.v]-h[r.u][r.v-1]),w[r.u][r.v]);
                q.add(new pair(r.u,r.v-1,w[r.u][r.v-1]));  
             }
        }
        return w[w.length-1][w[0].length-1];
    }
}