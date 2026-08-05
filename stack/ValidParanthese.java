class Solution {
    public boolean isValid(String s) {
        Stack<Character>a=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(a.isEmpty())a.push(s.charAt(i));
            else if(s.charAt(i)==')'&&a.peek()=='(')a.pop();
            else if(s.charAt(i)==']'&&a.peek()=='[')a.pop();
            else if(s.charAt(i)=='}'&&a.peek()=='{')a.pop();
            else a.push(s.charAt(i));
        }
        return a.isEmpty();
    }
}