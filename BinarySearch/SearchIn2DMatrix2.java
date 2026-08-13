class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int i=0,j=m[0].length-1;
        while(i<m.length&&j>=0){
            if(m[i][j]==t)return true;
            else if(m[i][j]>t)j--;
            else i++;
        }
        return false;
    }
}