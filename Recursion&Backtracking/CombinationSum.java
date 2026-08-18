class Solution {
    public void backtracking(int[] c,int t,List<List<Integer>>a,ArrayList<Integer>x, int i){
        if(i==c.length||t<0){
            return ;
        }
        if(t==0){
            List<Integer>n=new ArrayList<>();
            for(int j=0;j<x.size();j++){
                n.add(x.get(j));
            }
           a.add(n);
            return ;
        }
         x.add(c[i]);
         backtracking(c,t-c[i],a,x,i);
         x.remove(x.size()-1);
          backtracking(c,t,a,x,i+1);
    }
    public List<List<Integer>> combinationSum(int[] c, int target) {
        List<List<Integer>>a=new ArrayList<>();
        ArrayList<Integer>x=new ArrayList<>();
        
        backtracking(c,target,a,x,0);
        return a;
    }
}