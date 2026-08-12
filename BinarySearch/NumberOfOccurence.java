class Solution {
    int countFreq(int[] arr, int t) {
        int f=-1;
        int s=0,e=arr.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(arr[m]==t){
                f=m;
                e=m-1;
            }
            else if(arr[m]<t){
                s=m+1;
            }
            else e=m-1;
        }
        if(f==-1)return 0;
        int l=-1;
        s=0;
        e=arr.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(arr[m]==t){
                l=m;
                s=m+1;
            }
            else if(arr[m]<t){
                s=m+1;
            }
            else e=m-1;
        }
        return l-f+1;
    }
}
