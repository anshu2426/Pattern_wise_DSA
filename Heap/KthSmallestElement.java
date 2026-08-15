class Solution {
    public int kthSmallest(int[] arr, int k) {
      PriorityQueue<Integer>a=new PriorityQueue<>(Collections.reverseOrder());
      for(int i=0;i<arr.length;i++){
          a.add(arr[i]);
          if(a.size()>k)a.remove();
      }
      return a.remove();
    }
}
 