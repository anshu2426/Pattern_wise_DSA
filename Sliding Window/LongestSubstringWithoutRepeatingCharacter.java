class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        HashMap<Character,Integer>a=new HashMap<>();
        int max=0;
        while(j<s.length()){
           if(a.containsKey(s.charAt(j))&&a.get(s.charAt(j))>=i){
            max=Math.max(max,j-i);
            i=a.get(s.charAt(j))+1;
           }
            a.put(s.charAt(j),j);
            j++;
        }
        max=Math.max(max,j-i);
        return max;
    }
}