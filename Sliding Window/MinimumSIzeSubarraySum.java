class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int c=Integer.MAX_VALUE;
        int s=0;
        
        while(j<nums.length){
            if(s<target){
                s=s+nums[j];
                j++;
           
            }
            else if(s>=target){
               c=Math.min(c,j-i);
               s=s-nums[i];
               i++;
            }
        }
        while(s>=target){
            c=Math.min(c,j-i);
            
            s=s-nums[i];
            i++;
           
        }
        if(c==Integer.MAX_VALUE)return 0;
        return c;
    }
}