class Solution {
    public boolean check(String s,int start,int end){
        if(start>=end)return true;
        if(s.charAt(start)!=s.charAt(end))return false;
        return check(s,start+1,end-1);
    }
    boolean isPalindrome(String s) {
        return check(s,0,s.length()-1);
    }
}