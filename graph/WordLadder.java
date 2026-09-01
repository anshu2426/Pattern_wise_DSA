class Solution {
    class pair{
        String s;
        int v;
        pair(String s,int v){
            this.s=s;
            this.v=v;
        }
    }
    public int ladderLength(String b, String e, List<String> w) {
        Queue<pair>q=new ArrayDeque<>();
        HashSet<String>h=new HashSet<>();
        for(int i=0;i<w.size();i++){
            h.add(w.get(i));
        }
        if(!h.contains(e))return 0;
        q.add(new pair(b,1));
        while(q.size()>0){
            pair t=q.remove();
            if(t.s.equals(e))return t.v;
            StringBuilder n=new StringBuilder(t.s);
            for(int i=0;i<n.length();i++){
                char c=n.charAt(i);
                for(int j=(int)('a');j<=(int)('z');j++){
                    if((char)(j)==c)continue;
                    n.setCharAt(i,(char)(j));
                    if(h.contains(n.toString())){
                        h.remove(n.toString());
                        q.add(new pair(n.toString(),t.v+1));
                    }
                }
                 n.setCharAt(i,c);
            }
             
        }
        return 0;
    }
}