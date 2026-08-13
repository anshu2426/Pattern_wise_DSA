class Solution {
    public int findMin(int[] nums) {
        int s=1,e=nums.length-2;
        if(nums[0]<nums[nums.length-1])return nums[0];
        int p=nums[nums.length-1];
        while(s<=e){
            int m=(s+e)/2;
            if(nums[m]<nums[nums.length-1]){
                p=nums[m];
                e=m-1;
            }
            else s=m+1;
        }
        return p;
    }
}