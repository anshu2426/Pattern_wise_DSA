class Solution {
    public boolean guess(int m,int[] a,int k){
        int l=a[0];
        for(int i=1;i<a.length;i++){
            if(Math.abs(l-a[i])>=m){
                k--;
                l=a[i];
            }
            if(k<=1)return true;
        }
        return k<=0;
    }
    public int aggressiveCows(int[] arr, int k) {
       Arrays.sort(arr);
        int s=1,e=arr[arr.length-1];
       int ans=1;
       while(s<=e){
           int m=(s+e)/2;
           if(guess(m,arr,k)){
               ans=m;
               s=m+1;
           }
           else e=m-1;
       }
       return ans;
    }
}