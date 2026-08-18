class Solution {
    // Function to remove all occurrences of the character from the string
    public void remove(StringBuilder b,char c,int i){
        if(i==b.length())return ;
        if(b.charAt(i)==c){
             b.replace(i,i+1,"");
              remove(b,c,i);
        }
       else  remove(b,c,i+1);
    }
    public void removeCharacter(StringBuilder s, char c) {
      remove(s,c,0);
    }
}