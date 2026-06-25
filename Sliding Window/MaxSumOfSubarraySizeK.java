class Solution {
    public int maxSubarraySum(int[] nums, int k) {
       int i=0,j=0;
       int m=Integer.MIN_VALUE,c=0;
      
       while(j<nums.length){
           if(j-i<k){
               c=c+nums[j];
               j++;
           }
           else {
               m=Math.max(c,m);
               c=c-nums[i];
               i++;
           }
       }
       if(j-i==k)m=Math.max(c,m);
       return m;
    }
}