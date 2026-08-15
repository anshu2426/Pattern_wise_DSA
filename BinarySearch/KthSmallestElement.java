class Solution {
    public int count(int[][] m,int mid){
        int i=0,j=m[0].length-1;
        int c=0;
        while(i<m.length&&j>=0){
            if(m[i][j]<=mid){
                c=c+j+1;
                i++;
            }
            else j--;
        }
        return c;
    }
    public int kthSmallest(int[][] m, int k) {
        int s=m[0][0],e=m[m.length-1][m[0].length-1];
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            int i=0,j=m[0].length-1;
            int count =count(m,mid);
            if(count>=k){
                ans=mid;
                e=mid-1;
            }
            else s=mid+1;
        }
        return ans;
    }
}