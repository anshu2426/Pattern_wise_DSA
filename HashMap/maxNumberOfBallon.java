class Solution {
    public int maxNumberOfBalloons(String t) {
        HashMap<Character,Integer>a=new HashMap<>();
        for(int i=0;i<t.length();i++){
            a.put(t.charAt(i),a.getOrDefault(t.charAt(i),0)+1);
        }
        int max=Integer.MAX_VALUE;
        if(!a.containsKey('b')||!a.containsKey('a')||!a.containsKey('l')||!a.containsKey('o')||!a.containsKey('n'))return 0;
        for(char e:a.keySet()){
            if(e=='b'||e=='a'||e=='n')max=Math.min(max,a.get(e));
            else if(e=='o'||e=='l')max=Math.min(max,a.get(e)/2);
        }
        if(max==Integer.MAX_VALUE)return 0;
        return max;
    }
}