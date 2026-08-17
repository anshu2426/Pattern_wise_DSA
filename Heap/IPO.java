class Solution {
    class pair{
        int c;
        int p;
        pair(int c,int p){
            this.c=c;
            this.p=p;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] p, int[] ca) {
        pair[] x=new pair[p.length];
        for(int i=0;i<p.length;i++){
           x[i]=new pair(ca[i],p[i]);
        }
        Arrays.sort(x,(d,e)->(d.c-e.c));
        int ans=w;
        PriorityQueue<Integer>a=new PriorityQueue<>(Collections.reverseOrder());
        int pre=0;
        while(k>0){
            while(pre<p.length){
                if(x[pre].c<=ans)a.add(x[pre].p);
                else {
                    break;
                }
                pre++;
            }
            if(a.size()==0)return ans;
            ans=ans+a.remove();
            k--;
        }
        return ans;
    }
}