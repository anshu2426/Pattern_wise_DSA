class Solution {
    class pair{
        int v;
        int f;
        pair(int v,int f){
            this.v=v;
            this.f=f;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<pair>a=new PriorityQueue<>((c,d)->{
            if(c.f!=d.f)return c.f-d.f;
            return c.v-d.v;
        });
        HashMap<Integer,Integer>b=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            b.put(nums[i],b.getOrDefault(nums[i],0)+1);
        }
        for(int e:b.keySet()){
            a.add(new pair(e,b.get(e)));
            if(a.size()>k)a.remove();
        }
        int[] ans=new int[k];
        for(int i=k-1;i>=0;i--){
            ans[i]=a.remove().v;
        }
        return ans;
    }
}