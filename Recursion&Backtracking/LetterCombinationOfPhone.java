class Solution {
    public void backtracking(String d,String[] a,StringBuilder s,List<String>x,int i){
        if(i==d.length()){
            x.add(s.toString());
            return;
        }
        int k=(int)((d.charAt(i)-'0')-2);
        for(int j=0;j<a[k].length();j++){
            s.append(a[k].charAt(j));
            backtracking(d,a,s,x,i+1);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> letterCombinations(String d) {
       String[] a={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder s=new StringBuilder("");
        List<String>x=new ArrayList<>();
        backtracking(d,a,s,x,0);
        return x;
    }
}