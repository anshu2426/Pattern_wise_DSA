class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0;
        int m=0;
        int c=0;
        while(j<nums.length){
             
           if(nums[j]==0&&c<k){
                c++;
            }
            else if(nums[j]==0&&c==k){
                  m=Math.max(m,j-i);
                while(i<=j&&c==k){
                    if(nums[i]==0)c--;
                    i++;
                }
                c++;
            }
            j++;
        }
         m=Math.max(m,j-i);
          return m;
    }
}