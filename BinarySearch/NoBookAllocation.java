class Solution {
    public boolean guess(long m,int[] arr,int k){
        long sum=0;
        int i=0;
        while(i<arr.length){
            if((sum+arr[i])<=m){
                sum=sum+arr[i];
            }
            else{
                k--;
                sum=arr[i];
            }
            i++;
        }
        if(sum<=m)k--;
        return k>=0;
    }
    public int findPages(int[] arr, int k) {
        if(k>arr.length)return -1;
       long max=arr[0];
       long sum=arr[0];
       for(int i=1;i<arr.length;i++){
           sum=sum+arr[i];
           max=Math.max(max,arr[i]);
       }
       long s=max,e=sum;
       long ans=sum;
       while(s<=e){
           long m=(s+e)/2;
           if(guess(m,arr,k)){
               ans=m;
               e=m-1;
           }
           else s=m+1;
       }
       return (int)ans;
    }
}