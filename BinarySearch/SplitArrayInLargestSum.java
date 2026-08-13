class Solution {
    public boolean guess(long m,int[] nums,int k){
        long sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum+nums[i]<=m){
                sum=sum+nums[i];
            }
            else {
                k--;
                sum=nums[i];
            }
        }
        return k>0;
    }
    public int splitArray(int[] nums, int k) {
        long s=nums[0];
        long e=nums[0];
        for(int i=1;i<nums.length;i++){
            s=Math.max(nums[i],s);
            e=e+nums[i];
        }
        long ans=e;
        long sum=e;
        while(s<=e){
            long m=(s+e)/2;
            if(guess(m,nums,k)){
                ans=m;
                e=m-1; 
            }
            else s=m+1;
        }
   
        return (int)ans;
    }
}