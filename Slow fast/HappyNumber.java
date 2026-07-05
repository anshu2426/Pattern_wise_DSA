class Solution {
    public int digit(int s){
        int t=0;
        while(s>0){
            int d=s%10;
            t=t+(d*d);
            s=s/10;
        }
        return t;
    }
    public boolean isHappy(int n) {
      int s=n,f=n;
      s=digit(s);
        f=digit(digit(f));
      while(f!=1){
        if(s==f)return false;
        s=digit(s);
        f=digit(digit(f));
      }
        return true;
    }
}