class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer>a=new HashMap<>();
        HashMap<Character,Integer>b=new HashMap<>();
        for(int i=0;i<m.length();i++){
            a.put(m.charAt(i),a.getOrDefault(m.charAt(i),0)+1);
        }
         for(int i=0;i<r.length();i++){
            b.put(r.charAt(i),b.getOrDefault(r.charAt(i),0)+1);
        }
        for(char e:b.keySet()){
            if(!a.containsKey(e)||a.get(e)<b.get(e))return false;
            
        }
        return true;
    }
}