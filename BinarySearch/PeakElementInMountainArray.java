class Solution {
    public int peakIndexInMountainArray(int[] nums) {
       int s=0,e=nums.length-1;
       int p=-1;
       while(s<=e){
        int m=(s+e)/2;
         if(nums[m]>nums[m+1]){
            p=m;
            e=m-1;
         }
         else s=m+1;
       }
       return p;
    }
}