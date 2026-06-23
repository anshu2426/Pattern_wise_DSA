class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int i=0,j=nums.length-1;
        int k=nums.length-1;
        while(i<=j){
            if(nums[i]>nums[j]){
                a[k]=nums[i];
                i++;
                
            }
            else{
                a[k]=nums[j];
                j--;
            }
            k--;
        }
        return a;
    }
}