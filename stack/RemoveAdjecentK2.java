class Solution {
    class pair{
        char v;
        int f;
        pair(char v,int f){
            this.v=v;
            this.f=f;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<pair>a=new Stack<>();
        for(int i=0;i<s.length();i++){
          if(a.isEmpty())a.push(new pair(s.charAt(i),1));
          else{
            if(a.peek().v==s.charAt(i)){
                if(a.peek().f==k-1){
                    for(int j=1;j<k;j++){
                        a.pop();
                    }
                }
                else a.push(new pair(s.charAt(i),a.peek().f+1));
            }
            else a.push(new pair(s.charAt(i),1));
          }
        }
        StringBuilder sb=new StringBuilder("");
        while(!a.isEmpty()){
            sb.append(a.pop().v);
        }
        return sb.reverse().toString();
    }
}