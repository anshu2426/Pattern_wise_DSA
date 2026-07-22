class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int[] k=new int[nums.length];
        k[0]=nums[0];
        int[] min=new int[nums.length];
        min[0]=nums[0];
      int m=Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){
            k[i]=Math.max(k[i-1]+nums[i],nums[i]);
            min[i]=Math.min(min[i-1]+nums[i],nums[i]);
            m=Math.max(m,Math.max(k[i],Math.abs(min[i])));
        }
        return m;
    }
}