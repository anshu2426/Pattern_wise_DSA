class Solution {
    void segregate0and1(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[k]=0;
                k++;
            }
        }
        for(int i=k;i<nums.length;i++){
            nums[i]=1;
        }
    }
}
