class Solution {
    public boolean check(TreeNode root,int t){
        if(root.left==null&&root.right==null){
         if(t==root.val)return true;
         return false;
       }
       boolean l=false,r=false;
       if(root.left!=null)l=check(root.left,t-root.val);
       if(root.right!=null)r=check(root.right,t-root.val);
       return l||r;
    }
    public boolean hasPathSum(TreeNode root, int t) {
       if(root==null)return false;
       return check(root,t);
    }
}