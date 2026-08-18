class Solution {
    public static int sum(int n){
        if(n==0)return 0;
        return n%10+sum(n/10);
    }
    static int sumOfDigits(int n) {
        return sum(n);
    }
}
