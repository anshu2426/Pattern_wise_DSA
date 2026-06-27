class Solution {
    public int longestKSubstr(String s, int k) {
        HashMap<Character,Integer>a=new HashMap<>();
        int i=0,j=0;
        int max=-1;
        while(j<s.length()){
           if(a.containsKey(s.charAt(j))){
               a.put(s.charAt(j),a.get(s.charAt(j))+1);
           }
           else a.put(s.charAt(j),1);
           if(a.size()>k){
               max=Math.max(max,j-i);
               while(i<=j&&a.size()>k){
                 a.put(s.charAt(i),a.get(s.charAt(i))-1);
                 if(a.get(s.charAt(i))==0)a.remove(s.charAt(i));
                 i++;
               }
               
           }
            j++;
        }
        if(a.size()==k)max=Math.max(max,j-i);
        return max;
    }
}