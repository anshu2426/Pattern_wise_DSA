class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;
        if(nums.length==2)return nums[0]>nums[1]?0:1;
      int s=1,e=nums.length-2;
      int q=nums[0]>nums[nums.length-1]?0:nums.length-1;
      int p=-1;
      while(s<=e){
        int m=e+(s-e)/2;
        if(nums[m]>nums[m+1]){
            p=m;
            e=m-1;
        }
        else   s=m+1;
      }
      if(p==-1)return q;
      return nums[q]>nums[p]?q:p;
    }
}