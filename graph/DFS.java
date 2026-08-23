class Solution {
    public void dfs(ArrayList<ArrayList<Integer>>g,ArrayList<Integer>a,int[] v,int i){
        if(v[i]==1)return ;
        a.add(i);
        v[i]=1;
        for(int j=0;j<g.get(i).size();j++){
            dfs(g,a,v,g.get(i).get(j));
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g) {
       ArrayList<Integer>a=new ArrayList<>();
       int[] v=new int[g.size()];
       dfs(g,a,v,0);
       return a;
    }
}