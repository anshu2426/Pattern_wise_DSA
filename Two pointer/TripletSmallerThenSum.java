class Solution {
    int countTriplets(int sum, int nums[]) {
       int m=0;
       Arrays.sort(nums);
       for(int i=0;i<nums.length-2;i++){
           int j=i+1,k=nums.length-1;
           while(j<k){
               int s=nums[i]+nums[j]+nums[k];
               if(sum>s){
                   m=m+k-j;
                   j++;
               }
               else k--;
           }
       }
       return m;
    }
}