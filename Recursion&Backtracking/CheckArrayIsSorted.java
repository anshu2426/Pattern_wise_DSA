class Solution {
    public boolean check(int[] arr,int s){
        if(s==arr.length-1)return true;
        if(arr[s]>arr[s+1])return false;
        return check(arr,s+1);
    }
    public boolean isSorted(int[] arr) {
       return check(arr,0);
    }
}