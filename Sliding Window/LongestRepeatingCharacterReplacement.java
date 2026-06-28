class Solution {
    public int find(int[] f){
        int m=0;
        int x=0;
        for(int i=0;i<f.length;i++){
           m= Math.max(f[i],m);
        }
        return m;
    }
    public int characterReplacement(String s, int k) {
        int[] f=new int[26];
        int i=0,j=0;
        int max=Integer.MIN_VALUE;
        while(j<s.length()){
            f[s.charAt(j)-'A']++;
            int m=find(f);
           if(j-i+1-m<=k){
             max=Math.max(max,j-i+1);
             
           }
           while(j-i+1-m>k){
            f[s.charAt(i)-'A']--;
            i++;
           }
           j++;
        }
        int m=find(f);
           if(j-i+1-m<=k){
             max=Math.max(max,j-i);
           }
      return max;
    }
}