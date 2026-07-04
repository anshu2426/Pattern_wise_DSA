class Solution {
    public boolean check(int[] s,int[] t){
       for(int i=0;i<t.length;i++){
        if(s[i] < t[i]) return false;
       }
       return true;
    }
    public String minWindow(String s, String t) {
        int x=-1,y=-1;
        int[] f = new int[128];
          for(int i=0;i<t.length();i++){
            f[t.charAt(i)]++;
          }
          int [] c=new int[128];
         int i=0,j=0;
         int m=Integer.MAX_VALUE;
          
         while(j<s.length()){
            c[s.charAt(j)]++;
           

            while(check(c,f)){
               if(m>j-i+1){
                y=j;
                x=i;
                m=y-x+1;
              }
              c[s.charAt(i)]--;
               i++;
            }
             j++;
         }

         if(x==-1&&y==-1)return "";
         return s.substring(x,y+1);
    }
}