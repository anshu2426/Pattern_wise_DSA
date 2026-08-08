class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>a=new HashMap<>();
        for(int i=0;i<s.length();i++){
            a.put(s.charAt(i),a.getOrDefault(s.charAt(i),0)+1);
        }
        int e=0,o=0;
        boolean c=true;
        for(char t:a.keySet()){
            if(a.get(t)%2==0)e=e+a.get(t);
            else {
                o=o+a.get(t)-1;
                c=false;
            }
        }
        if(c==false)o++;
        return e+o;
    }
}