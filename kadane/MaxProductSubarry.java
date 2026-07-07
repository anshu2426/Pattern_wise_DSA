class Solution {
    public int maxProduct(int[] nums) {
       int[] k=new int[nums.length];
       int[] min=new int[nums.length];
       k[0]=nums[0];
       int m=nums[0];
       min[0]=nums[0];
       for(int i=1;i<nums.length;i++){
     
          k[i]=Math.max(k[i-1]*nums[i],Math.max(min[i-1]*nums[i],nums[i]));
          min[i]=Math.min(min[i-1]*nums[i],Math.min(k[i-1]*nums[i],nums[i]));
  
        m=Math.max(m,k[i]);
       }
       return m;
    }
}