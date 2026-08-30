class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] e) {
       ArrayList<ArrayList<Integer>>a=new ArrayList<>();
       for(int i=0;i<V;i++){
           a.add(new ArrayList<>());
       }
       int[] d=new int[V];
       for(int i=0;i<e.length;i++){
           a.get(e[i][0]).add(e[i][1]);
           d[e[i][1]]++;
       }
       Queue<Integer>q=new ArrayDeque<>();
       for(int i=0;i<d.length;i++){
           if(d[i]==0)q.add(i);
       }
       ArrayList<Integer>ans=new ArrayList<>();
       while(q.size()>0){
           int t=q.remove();
           for(int i=0;i<a.get(t).size();i++){
               d[a.get(t).get(i)]--;
               if(d[a.get(t).get(i)]==0)q.add(a.get(t).get(i));
           }
           ans.add(t);
       }
     return ans;
    }
}