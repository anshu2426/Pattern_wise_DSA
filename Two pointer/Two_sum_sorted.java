class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=nums.length-1;
        int[] a={-1,-1};
        while(i<j){
            if(nums[i]+nums[j]==target){
                a[0]=i+1;
                a[1]=j+1;
                return a;
            }
            else if(nums[i]+nums[j]<target)i++;
            else j--;
        }
        return a;
    }
}