class Solution {
    public int findCeil(int[] arr, int x) {
       int u=arr.length;
       int s=0,e=arr.length-1;
       while(s<=e){
           int m=(s+e)/2;
           if(arr[m]>=x){
               u=m;
               e=m-1;
           }
           else s=m+1;
       }
       if(u==arr.length)return -1;
       return u;
    }
}
