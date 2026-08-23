class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g) {
       ArrayList<Integer>a=new ArrayList<>();
       int[] v=new int[g.size()];
       Queue<Integer>q=new ArrayDeque<>();
       q.add(0);
       v[0]=1;
       while(q.size()>0){
           int t=q.remove();
           a.add(t);
           for(int i=0;i<g.get(t).size();i++){
             if(v[g.get(t).get(i)]!=1){
                   q.add(g.get(t).get(i));
                   v[g.get(t).get(i)]=1;
             }
           }
       }
       return a;
    }
}