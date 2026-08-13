class Solution {
    public boolean eating(int[] p,int h,int m){
       int i=0;
       int t=0;
       int sum=m;
       while(i<p.length){
         t=t+p[i]/m;
         if(p[i]%m!=0)t++;
         if(t>h)return false;
         i++;
       }
       return true;
    }
    public int minEatingSpeed(int[] p, int h) {
        int e=p[0];
         int s=1;
        for(int i=1;i<p.length;i++){
            e=Math.max(p[i],e);
        }
        int min=e;
        while(s<=e){
            int m=(s+e)/2; 
            if(eating(p,h,m)){
                min=m;
                e=m-1;
            }
            else s=m+1;
        }
        return min;
    }
}