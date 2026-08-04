class Solution {
    public int[][] intervalIntersection(int[][] f, int[][] s) {
        ArrayList<int[]>a=new ArrayList<>();
        int i=0,j=0;
       while(i < f.length && j < s.length){
      if(f[i][0]<=s[j][0]){
        if(f[i][1]>=s[j][0]){
            a.add(new int[]{Math.max(f[i][0],s[j][0]),Math.min(f[i][1],s[j][1])});
        }
      }
      else{
        if(s[j][1]>=f[i][0]){
            a.add(new int[]{Math.max(f[i][0],s[j][0]),Math.min(f[i][1],s[j][1])});
        }
      }

    if(f[i][1] < s[j][1]){
        i++;
    }else{
        j++;
    }
}
        int[][] ans=new int[a.size()][2];
        for(i=0;i<a.size();i++){
            ans[i][0]=a.get(i)[0];
            ans[i][1]=a.get(i)[1];
        }
       
        return ans;
    }
}