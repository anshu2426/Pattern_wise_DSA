class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int c=Integer.MAX_VALUE;
        int r=-1;
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int j=i+1,k=nums.length-1;
            while(j<k){
                
                 if(nums[j]+nums[k]+nums[i]<target){
                    if(c>Math.abs(target-(nums[i]+nums[j]+nums[k]))){
                        c=Math.abs(target-(nums[i]+nums[j]+nums[k]));
                        r=nums[i]+nums[j]+nums[k];
                    }
                      j++;
                  while(j<k&&nums[j]==nums[j-1])j++;
                }
                else {
                     if(c>Math.abs(target-(nums[i]+nums[j]+nums[k]))){
                        c=Math.abs(target-(nums[i]+nums[j]+nums[k]));
                        r=nums[i]+nums[j]+nums[k];
                    }
                 k--;
                  while(j<k&&nums[k]==nums[k+1])k--;
                }
            }
        }
        return r;
    }
}