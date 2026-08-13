class Solution {
    public boolean searchMatrix(int[][] m, int t) {
      int s=0,e=m.length*m[0].length-1;
      while(s<=e){
        int mid=(s+e)/2;
        int r=mid/m[0].length;
        int c=mid%m[0].length;
        if(m[r][c]==t)return true;
        else if(m[r][c]>t)e=mid-1;
        else s=mid+1;
      }
      return  false;
    }
}