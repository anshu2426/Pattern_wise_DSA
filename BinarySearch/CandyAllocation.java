class Solution {
    public long guess(int[] c,int m){
        long count=0;
        int r=0;
        for(int i=0;i<c.length;i++){
            count=count+(c[i])/m;  
        }
        return (long)count;
    }
    public int maximumCandies(int[] c, long k) {
      int s=1;
      int e=c[0];
      for(int i=0;i<c.length;i++){
        e=Math.max(e,c[i]);
      }
      int ans=0;
      while(s<=e){
        int m=(s+e)/2;
        if(guess(c,m)>=k){
            ans=m;
            s=m+1;
        }
        else e=m-1;
      }
      return ans;
    }
}