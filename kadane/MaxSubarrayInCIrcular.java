class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length==1)return nums[0];
        int[] k=new int[nums.length];   
        k[0]=nums[0];
        int m=nums[0];
        int s=nums[0];
        for(int i=1;i<nums.length;i++){
            k[i]=Math.max(nums[i],k[i-1]+nums[i]);
            m=Math.max(m,k[i]);
            s=s+nums[i];
        } 
        int[] j=new int[nums.length];
        j[1]=nums[1];
        int min=nums[1];
        for(int i=2;i<nums.length-1;i++){
            j[i]=Math.min(j[i-1]+nums[i],nums[i]);
            min=Math.min(j[i],min);
        }
        return Math.max(s-min,m);
    }
}