class Solution {
    class pair{
        char c;
        int f;
        pair(char c,int f){
            this.c=c;
            this.f=f;
        }
    }
    public String reorganizeString(String s) {
        PriorityQueue<pair>a=new PriorityQueue<>((d,e)->{
            if(d.f!=e.f)return e.f-d.f;
            return d.c-e.c; 
        });
         int[] fr=new int[26];
        for(int i=0;i<s.length();i++){
            fr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<fr.length;i++){
            if(fr[i]!=0)a.add(new pair((char)('a'+i),fr[i]));
        }
        StringBuilder sb=new StringBuilder("");
        while(a.size()>0){
            pair t=a.remove();
            pair t2=t;
            if(sb.length()>0&&a.size()>=1&&sb.charAt(sb.length()-1)==t.c){
                t2=a.remove();
                sb.append(t2.c);
                if(t2.f!=1)a.add(new pair(t2.c,t2.f-1));
                sb.append(t.c);
            if(t.f!=1)a.add(new pair(t.c,t.f-1));
            }
            else{
                sb.append(t.c);
              if(t.f!=1)a.add(new pair(t.c,t.f-1));
            }
        }
        for(int i=0;i<sb.length()-1;i++){
            if(sb.charAt(i)==sb.charAt(i+1))return "";
        }
        return sb.toString();
    }
}