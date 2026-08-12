class Solution {
    public int[] searchRange(int[] nums, int t) {
        int[] ans={-1,-1};
        int s=0,e=nums.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(nums[m]>=t){
               if(nums[m]==t) ans[0]=m;
                e=m-1;
            }
            else s=m+1;
        }
        s=0;e=nums.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(nums[m]<=t){
                if(nums[m]==t) ans[1]=m;
                s=m+1;
            }
            else e=m-1;
        }
        return ans;
    }
}