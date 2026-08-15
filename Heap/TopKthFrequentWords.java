class Solution {
    class pair{
        String v;
        int f;
        pair(String v,int f){
            this.v=v;
            this.f=f;
        }
    }
    public List<String> topKFrequent(String[] w, int k) {
        PriorityQueue<pair>a=new PriorityQueue<>((c,d)->{
            if(c.f!=d.f)return c.f-d.f;
            return d.v.compareTo(c.v);
        });
        HashMap<String,Integer>b=new HashMap<>();
        for(int i=0;i<w.length;i++){
            b.put(w[i],b.getOrDefault(w[i],0)+1);
        }
        for(String e:b.keySet()){
            a.add(new pair(e,b.get(e)));
            if(a.size()>k)a.remove();
        }
        List<String>x=new ArrayList<>();
        while(a.size()>0){
            x.add(a.remove().v);
        }
         List<String>ans=new ArrayList<>();
           for(int i=x.size()-1;i>=0;i--){
            ans.add(x.get(i));
        }
        return ans;
    }
}