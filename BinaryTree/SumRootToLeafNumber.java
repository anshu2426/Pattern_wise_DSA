class Solution {
    public void check(TreeNode root,int[] t,int s){
        if(root==null)return ;
        if(root.left==null&&root.right==null){
            s=s*10+root.val;
            t[0]=t[0]+s;
            return ;
        }
        check(root.left,t,s*10+root.val);
        check(root.right,t,s*10+root.val);
    }
    public int sumNumbers(TreeNode root) {
        int[] t=new int[1];
        check(root,t,0);
        return t[0];
    }
}