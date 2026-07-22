class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] p=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++){
            p[i]=s+nums[i];
            s=s+nums[i];
        }
        int c=0;
        HashMap<Integer,Integer>a=new HashMap<>();
        a.put(0,1);
    
        for(int i=0;i<nums.length;i++){
           if(p[i]%k>=0){
            if(a.containsKey(p[i]%k))c=c+a.get(p[i]%k);
            a.put(p[i]%k,a.getOrDefault(p[i]%k,0)+1);
           }
           else{
            if(a.containsKey(p[i]%k+k))c=c+a.get(p[i]%k+k);
            a.put(p[i]%k+k,a.getOrDefault(p[i]%k+k,0)+1);
           }
        }
        return c;
    }
}