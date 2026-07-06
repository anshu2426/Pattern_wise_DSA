class Solution {
    static int smallestSumSubarray(int a[], int size) {
       int min=a[0];
       int[] k=new int[a.length];
       k[0]=a[0];
       for(int i=1;i<size;i++){
           k[i]=Math.min(k[i-1]+a[i],a[i]);
           min=Math.min(k[i],min);
       }
       return min;
    }
}