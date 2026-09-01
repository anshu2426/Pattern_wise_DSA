class Solution {
    public int findCheapestPrice(int n, int[][] f, int src, int dst, int k) {
        int[] d=new int[n];
        for(int i=0;i<n;i++){
            d[i]=100000;
        }
        d[src]=0;
        int[] w=new int[n];
        for(int i=0;i<n;i++){
            w[i]=100000;
        }
        w[src]=0;
        int[] t=new int[n];
        for(int j=0;j<n;j++){
            t[j]=100000;
        }
        t[src]=0;
        
        for(int i=0;i<=k;i++){
            for(int j=0;j<f.length;j++){
                if(t[f[j][1]]>w[f[j][0]]+f[j][2]){
                  t[f[j][1]]=w[f[j][0]]+f[j][2];
                }
            }
            for(int j=0;j<w.length;j++){
                w[j]=t[j];
            }
        }
        if(w[dst]==100000)return -1;
        return w[dst];
    }
}