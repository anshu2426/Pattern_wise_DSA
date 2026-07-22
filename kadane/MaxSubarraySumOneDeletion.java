class Solution {
    public int maximumSum(int[] nums) {
        int[] k=new int[nums.length];
        k[0]=nums[0];
        int m=nums[0];
       int oneDelete=0;
        
        for(int i=1;i<nums.length;i++){
            k[i]=Math.max(k[i-1]+nums[i],nums[i]);
           oneDelete=Math.max(oneDelete+nums[i],k[i-1]);
            m=Math.max(k[i],Math.max(m,oneDelete));
        }
        return m;
    }
}