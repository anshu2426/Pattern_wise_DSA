class Solution {
    public int bs(int[] nums,int s,int e,int t){
        while(s<=e){
            int m=(s+e)/2;
            if(nums[m]==t)return m;
            else if(nums[m]>t)e=m-1;
            else s=m+1;
        }
        return -1;
    }
    public int search(int[] nums, int t) {
        if(nums[0]<nums[nums.length-1]) return bs(nums,0,nums.length-1,t);
         int p=nums.length-1;
         int s=0,e=nums.length-1;
         while(s<=e){
            int m=(s+e)/2;
            if(nums[m]<nums[nums.length-1]){
                p=m;
                e=m-1;
            }
            else s=m+1;
         }
        if(nums[nums.length-1]>=t)return bs(nums,p,nums.length-1,t);
        return bs(nums,0,p-1,t);
    }
}