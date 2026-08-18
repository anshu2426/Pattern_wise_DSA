class Solution {
    public void backtracking(int n,List<String>a,StringBuilder s,int o,int c){
      
          if(o==n&&c==n){
            a.add(s.toString());
            return ;
          }
          if(o<n){
            s.append('(');
            backtracking(n,a,s,o+1,c);
            s.deleteCharAt(s.length()-1);
          }
          if(c<o){
             s.append(')');
            backtracking(n,a,s,o,c+1);
           s.deleteCharAt(s.length()-1);
          }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder s=new StringBuilder(n);
        List<String>a=new ArrayList<>();
        backtracking(n,a,s,0,0);
        return a;
    }
}