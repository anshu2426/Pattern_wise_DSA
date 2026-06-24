class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int p=1;
        for(int i=1;i<nums.length;i++){
            if(nums[k]==nums[i]&&i-k<2){
                nums[p]=nums[i];
                p++;
            }
            else if(nums[k]!=nums[i]){
                nums[p]=nums[i];
                k=i;
                p++;
            }
        }
    
        return p;
    }
}