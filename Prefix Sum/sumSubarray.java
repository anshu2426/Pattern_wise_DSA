class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] p=new int[nums.length];
        int s=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            p[i]=s+nums[i];
            s=s+nums[i];
        }
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(p[i]==k)c++;
             if(a.containsKey(p[i]-k))c=c+a.get(p[i]-k);
            a.put(p[i],a.getOrDefault(p[i],0)+1);
        }
        return c;
    }
}