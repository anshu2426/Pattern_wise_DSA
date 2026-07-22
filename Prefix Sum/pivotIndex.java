class Solution {
    public int pivotIndex(int[] nums) {
        int[] pre=new int[nums.length];
        int[] suf=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            suf[i]=suf[i+1]+nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            if(suf[i]==pre[i])return i;
        }
        return -1;
    }
}