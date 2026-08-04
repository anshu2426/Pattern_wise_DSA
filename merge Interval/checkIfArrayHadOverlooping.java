class Solution {
    static boolean isIntersect(int[][] in) {
       Arrays.sort(in,(x,y)->(x[0]-y[0]));
       for(int i=0;i<in.length-1;i++){
           if(in[i][1]>=in[i+1][0])return true;
       }
       return false;
    }
}