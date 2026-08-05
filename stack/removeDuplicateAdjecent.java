class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>a=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(a.isEmpty()){
                a.push(s.charAt(i));
            }
            else if(a.peek()==s.charAt(i)){
                a.pop();
            }
            else a.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder("");
        while(!a.isEmpty()){
            sb.append(a.pop());
        }
        return sb.reverse().toString();
    }
}