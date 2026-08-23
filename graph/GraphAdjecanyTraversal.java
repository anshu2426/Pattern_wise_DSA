
class Solution {
    public List<List<Integer>> printGraph(int V, int e[][]) {
        // code here
        List<List<Integer>>a=new ArrayList<>();
        for(int i=0;i<V;i++){
            a.add(new ArrayList<>());
        }
        for(int i=0;i<e.length;i++){
            a.get(e[i][0]).add(e[i][1]);
            a.get(e[i][1]).add(e[i][0]);
        }
        return a;
    }
}