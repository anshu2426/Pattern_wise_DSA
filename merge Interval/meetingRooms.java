class Solution {
    public int minMeetingRooms(int[] s, int[] e) {
       Arrays.sort(s);
       Arrays.sort(e);
       int i=0,j=0;
       int r=0;
       int m=0;
       while(i<s.length&&j<e.length){
           
           if(s[i]<e[j]){
               r++;
               i++;
           }
           else{
               r--;
               j++;
           }
           m=Math.max(r,m);
       }
       return m;
    }
}
