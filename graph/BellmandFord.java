class Solution {
    public ArrayList<Integer> bellmanFord(int V, int[][] e, int src) {
      int[] d=new int[V];
      for(int i=0;i<V;i++){
          d[i]=100000000;
      }
      d[src]=0;
      for(int i=0;i<V-1;i++){
          for(int j=0;j<e.length;j++){
              if(d[e[j][0]]!=100000000){
                 if(d[e[j][1]]>d[e[j][0]]+e[j][2])d[e[j][1]]=d[e[j][0]]+e[j][2];
              }
          }
      }
      for(int j=0;j<e.length;j++){
              if(d[e[j][0]]!=100000000){
                 if(d[e[j][1]]>d[e[j][0]]+e[j][2])return new ArrayList<Integer>(Arrays.asList(-1));
              }
          }
      ArrayList<Integer>a=new ArrayList<>();
      boolean c=true;
      for(int i=0;i<V;i++){
          a.add(d[i]);
      }
    return a;
   
    }
}
