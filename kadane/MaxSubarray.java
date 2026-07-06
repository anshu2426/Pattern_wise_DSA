class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int[] k=new int[nums.length];
        k[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            k[i]=Math.max(k[i-1]+nums[i],nums[i]);
            max=Math.max(max,k[i]);
        }
        return max;
    }
}