class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer>a=new Stack<>();
      
        int[] ans=new int[t.length];
        for(int i=t.length-1;i>=0;i--){
            while(a.size()>0&&t[a.peek()]<=t[i]){
                a.pop();
            }
            if(a.size()==0)ans[i]=0;
            else ans[i]=a.peek()-i;
            a.push(i);
          
        }
        return ans;
    }
}