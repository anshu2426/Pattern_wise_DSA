class Solution {
    public void reverse(char[] s,int st,int e){
        if(st>=e)return ;
        char t=s[st];
        s[st]=s[e];
        s[e]=t;
        reverse(s,st+1,e-1);
    }
    public void reverseString(char[] s) {
       reverse(s,0,s.length-1);
    }
}