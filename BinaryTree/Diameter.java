class Solution {
    int max;
    public int level(TreeNode root){
        if(root==null)return 0;
        int l=level(root.left);
        int r=level(root.right);
        max=Math.max(l+r,max);
        return 1+Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
       max=0;
       level(root);
       return max;
    }
}