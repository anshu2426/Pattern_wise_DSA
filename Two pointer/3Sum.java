class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>a=new ArrayList<>();
     
        for(int i=0;i<nums.length;i++){
           if(i>0&&nums[i]==nums[i-1])continue;
            int j=i+1,k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]==nums[i]*-1){

                     ArrayList<Integer>b=new ArrayList<>();
                    b.add(nums[i]);
                     b.add(nums[j]);
                     b.add(nums[k]);
                     a.add(b);
                  
                  int x=j+1,y=k-1;
             while(x<k&&nums[j]==nums[x])x++;
                while(y>=j&&nums[k]==nums[y])y--;
                  j=x;
                  k=y;
                }
                else if(nums[j]+nums[k]<nums[i]*-1)j++;
                else k--;
            }
        }
        return a;
    }
}