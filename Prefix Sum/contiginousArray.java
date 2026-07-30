class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>a=new HashMap<>();
        int m=0;
        int z=0,o=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)z++;
            else o++;
            if(z-o==0)m=Math.max(m,i+1);
           else if(a.containsKey(z-o)){
                m=Math.max(m,i-a.get(z-o));
            }
            else{
                a.put(z-o,i);
            }
        }
        
        
        return m;
    }
}