class Solution {
    public boolean guess(int m,int[] w,int d){
        int count=0;
        int sum=0;
        for(int i=0;i<w.length;i++){
            if(sum+w[i]<=m){
                sum+=w[i];
            }
            else{
                count++;
                if(count>=d)return false;
                sum=w[i];
            }
        }
        return count<d;
    }
    public int shipWithinDays(int[] w, int d) {
        int s=w[0];
        int e=w[0];
        for(int i=1;i<w.length;i++){
            s=Math.max(s,w[i]);
            e=e+w[i];
        }
        int ans=e;
        while(s<=e){
            int m=(s+e)/2;
            if(guess(m,w,d)){
                ans=m;
                e=m-1;
            }   
            else s=m+1;
        }
        return ans;
    }
}