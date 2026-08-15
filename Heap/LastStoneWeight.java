class Solution {
    public int lastStoneWeight(int[] s) {
        PriorityQueue<Integer>a=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<s.length;i++){
            a.add(s[i]);
        }
        while(a.size()>1){
            a.add(a.remove()-a.remove());
        }
        return a.remove();
    }
}